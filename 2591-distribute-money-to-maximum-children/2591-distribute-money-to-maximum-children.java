class Solution {
    public int distMoney(int money, int children) {
        int rem = money - children;
        if(rem < 0) return -1;
        int max8s = Math.min(rem / 7, children);
         int left = rem - (max8s * 7);

        if (max8s == children && left > 0) {
            max8s--;
        } else if (max8s == children - 1 && left == 3) {
            max8s--;
        }

        return max8s;

    }
}