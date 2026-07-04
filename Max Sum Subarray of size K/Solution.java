class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low = 0, high = k - 1, sum = 0, res = 0;
        for (int i = low; i <= high; i++)
            sum += arr[i];
        int n = arr.length;
        while (high < n) {
            res = Math.max(sum, res);
            low++;
            high++;
            if (high == n)
                break;
            sum = sum - arr[low - 1] + arr[high];
        }
        return res;
    }
}