class Solution {
    public int findNumbers(int[] nums) {
        // 1 10 100 1000 10000 100000
        int count = 0;
        for(int x : nums) {
            if ((9 < x && x < 100 ) || (999 < x && x < 10000) || x == 100000) {
                count++;
            }
        }
        return count;
    }
}