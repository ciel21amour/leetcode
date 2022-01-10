class Solution {
    public void duplicateZeros(int[] arr) {
        // find number of possible zeros you should duplicate
        int duplicates = 0;
        int arrLength = arr.length - 1;
        for(int i = 0; i <= arrLength - duplicates; i++) {
            if(arr[i] == 0) {
                if(duplicates + i == arrLength) {
                    arr[arrLength] = 0;
                    arrLength -= 1;
                    break;
                } 
                duplicates++;
            }
        }
        
        // shift your array to create space for them.
        for(int i = arrLength - duplicates ; i >=0; i--) {
            if(arr[i] == 0) {
                arr[i + duplicates ] = 0;
                duplicates--;
                arr[i + duplicates ] = 0;
            } else {
                arr[i + duplicates ] = arr[i];
            }
        }
    }
}