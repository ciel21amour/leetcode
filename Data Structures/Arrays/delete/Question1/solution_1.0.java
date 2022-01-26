// does not work. throws time limit exceeded exception.

class Solution {
    public int removeElement(int[] nums, int val) {
        int t =0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i]==val) {
                shiftArray(nums, i);
                t++;
            }
        }
        return nums.length - t;
    }
    
    public void shiftArray(int[]nums, int i) {
        for (int j = i; j< nums.length; i++) {
            nums[j] = nums[j+1];
        }
    }
}


