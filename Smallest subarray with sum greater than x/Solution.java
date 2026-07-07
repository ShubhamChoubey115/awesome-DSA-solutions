class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int sum=0, high=0,low=0,length=Integer.MAX_VALUE,n=arr.length;
        while(high<n){
            sum=sum+arr[high];
            while(sum>x){
                int l= high-low+1;
                length=Math.min(l,length);
                
                sum=sum-arr[low];
                low++;
            }
            high++;
        }
        if(length==Integer.MAX_VALUE)
        return 0;
        return length;
    }
}
