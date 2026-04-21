class Solution {
    public String defangIPaddr(String address) {
        String[] parts = address.split("[.]");
        StringBuilder sb = new StringBuilder();
        String s = "[.]";
        for(int i=0;i<parts.length-1;i++)
        {
            sb.append(parts[i]).append(s);
        }
        return sb.append(parts[parts.length-1]).toString();
    }
}