class Solution {
    int missingNum(int arr[]) {
         int n = arr.length + 1;
        int xorSum = 0;
        
        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorSum ^= i;
        }
        
        // XOR all elements present in the array
        for (int num : arr) {
            xorSum ^= num;
        }
        
        // The remaining value is the missing number
        return xorSum;
    }
}