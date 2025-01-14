class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
     int sum=0;
     for(int x:arr){
         sum +=x;
     }
     //check
     int ls=0;
     for(int i=0;i<arr.length;i++){
         sum -= arr[i];
         if(sum==ls) return i;
         ls +=arr[i];
     }
     return -1;
    }
}
