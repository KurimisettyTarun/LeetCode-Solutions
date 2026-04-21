class Solution {
    public String defangIPaddr(String address) {
        
        String s = "[.]";
        
        return address.replace(".",s);
    }
}