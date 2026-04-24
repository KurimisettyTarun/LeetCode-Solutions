class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       String allL = moves.replace("_", "L");
        String allR = moves.replace("_", "R");

        int distL = Math.abs(getPosition(allL));
        int distR = Math.abs(getPosition(allR));

        return Math.max(distL, distR);
    }

    private int getPosition(String s) {
        int pos = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') pos--;
            else pos++;
        }

        return pos;
    }
}