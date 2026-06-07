class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty())return 0;
        String[] a = s.split("\\s+");
        return a.length;
    }
}