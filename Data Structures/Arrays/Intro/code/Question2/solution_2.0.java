class Solution {
    public int findNumbers(int[] nums) {
        // 1 10 100 1000 10000 100000
        int even = 0;
        for(int x : nums) {
            if (x / 10 == 0) {
                continue;
            } else if (x / 100 == 0) {
                even++;
            } else if (x / 1000 == 0) {
                continue;
            } else if (x / 10000 == 0) {
                even++;
            } else if (x / 100000 == 0) {
                continue;
            } else if (x / 1000000 == 0) {
                even++;
            }
        }
        return even;
    }
}