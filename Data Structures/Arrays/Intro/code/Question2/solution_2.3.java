class Solution {
    public int findNumbers(int[] nums) {
        // 1 10 100 1000 10000 100000
        int count = 0;
        for(int x : nums) {
            String s = String.valueOf(x);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}