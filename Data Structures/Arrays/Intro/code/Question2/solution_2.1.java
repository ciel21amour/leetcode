class Solution {
    public int findNumbers(int[] nums) {
        // 1 10 100 1000 10000 100000
        int count = 0;
        for(int x : nums) {
            if (even(numberOfDigits(x))) {
                count++;
            }
        }
        return count;
    }
    
    boolean even(int x) {
        if(x % 2 == 0) {
            return true;
        }
        return false;
    }
    
    int numberOfDigits(int x) {
        int count = 0;
        while(x > 0) {
            count ++;
            x/=10;
        }
        return count;
    }
}