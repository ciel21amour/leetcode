class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for (int i=0; i< nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/**
 * 
 * 
 * Intuition
 * Since this question is asking us to remove all elements of the given value in-place, 
 * we have to handle it with O(1)O(1) extra space. How to solve it? We can keep two pointers i and j,
 * where i is the slow-runner while j is the fast-runner.
 * 
 * Algorithm
 * When nums[j] equals to the given value, skip this element by incrementing j. As long as nums[j] != val, 
 * we copy nums[j] to nums[i] and increment both indexes at the same time. 
 * Repeat the process until j reaches the end of the array and the new length is i.
 * / 


//Time complexity : O(n). Assume the array has a total of nn elements, both i and j traverse at most 2n steps.
//Space complexity : O(1).