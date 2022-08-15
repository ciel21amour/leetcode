class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int bottom = 0;
        int top = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(Math.abs(nums[bottom]) > Math.abs(nums[top])) {
                answer[i] = nums[bottom] * nums[bottom];
                bottom++;
            } else {
                answer[i] = nums[top] * nums[top];
                top--;
            }
        }
        return answer;
    }
}