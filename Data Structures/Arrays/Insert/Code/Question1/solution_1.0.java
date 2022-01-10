class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                moveArray(arr, i);
                i++;
            }
        }
        
    }
    
    void moveArray(int[] arr, int index) {
        for(int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
    }
}