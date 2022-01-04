class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int j =0;
        for(int i = 0; i < nums.length; i++) {
            int number_ones = 0;
            for (j = i ; j < nums.length; j++) {
                if(nums[j] == 1) {
                    number_ones += 1;
                } else {
                    i = j;
                    break;
                }
            }
            if(maxOnes < number_ones) {
                maxOnes = number_ones;
            }
        }
        return maxOnes;
    }
}

// i = 0 j = 0 number_ones = 1
// i = 0 j = 1 number_ones = 2
// i = 0 j = 2 number_ones = 2
// break;
// maxOnes = 2
// i = 3 j = 3 number_ones = 1
// i = 3 j = 4 number_ones = 2
// i = 3 j = 5 number_ones = 3
// i == 6 ; done.


