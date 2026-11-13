class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String key = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        
        while (key.length() >= k) {
            String temp = key.substring(key.length() - k);
            
            if (sb.length() > 0) {
                sb.insert(0, "-");
            }
            
            sb.insert(0, temp);
            
            key = key.substring(0, key.length() - k);
        }
        
        if (key.length() > 0) {
            if (sb.length() > 0) {
                sb.insert(0, "-");
            }
            sb.insert(0, key);
        }
        
        return sb.toString();
    }
}