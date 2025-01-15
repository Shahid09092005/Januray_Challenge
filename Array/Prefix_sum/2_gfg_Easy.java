class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        int t=0;
        int prefixSum = arr[k-1];
        for(int i=k;i<arr.length;i++){
            int temp = arr[i]-arr[t++];
            if(temp>prefixSum){
                prefixSum = temp;
            }
        }
        return prefixSum;
        // Code here
    }
}
