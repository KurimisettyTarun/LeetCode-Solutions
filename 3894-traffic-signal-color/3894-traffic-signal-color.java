class Solution {
    public String trafficSignal(int timer) {
        

        return timer==0?"Green":(timer==30?"Orange":(30<timer && timer <=90)?"Red":"Invalid");
    }
}