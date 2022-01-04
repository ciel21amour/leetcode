class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int count = 0;
        for(int i : nums) {
            if(i == 1) {
                count += 1;
            } else {
                maxOnes = Math.max(maxOnes, count);
                count = 0;
            }
        }
        // System.gc();
        return Math.max(maxOnes, count);
    }
}

// using only one for loop. 
// using System.gc() at the end is sort of hackish.
/// System.gc() triggers a major GC. Hence, there is a risk of spending some time on the stop-the-world phase, depending on your garbage collector 
// implementation. As a result, we have an unreliable tool with a potentially significant performance penalty.

// Existence of explicit garbage collection invocation should be a serious red flag for everyone.
