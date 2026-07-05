class Solution {
    public boolean squareIsWhite(String coordinates) {
        String odd = "aceg";
        String ch = String.valueOf(coordinates.charAt(0));
        int num = Integer.parseInt(String.valueOf(coordinates.charAt(1)));
        if(odd.contains(ch) && num%2==0)
        return true;
        else if(!odd.contains(ch)&& num%2!=0)
        return true;
        else return false;
    }
}