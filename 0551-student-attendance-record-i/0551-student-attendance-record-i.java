class Solution {
    public boolean checkRecord(String s) {

        String replaceA = s.replace("A","");
        if(s.length()-replaceA.length()>=2)return false;

        if(s.contains("LLL"))return false;
        return true; 
    }
}