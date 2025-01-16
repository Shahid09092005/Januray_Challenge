public class merge {
    //print
    public static void print(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    // solve
    public static void solve(int[]arr,int st,int end){
        if(st<end){
            int mid = (st+end)/2;// mid element
            solve(arr, st, mid);
            solve(arr, mid+1, end);
            merge(arr,st,mid,end);
        }
    }
    //merge two sorted array
    public static void merge(int[]arr , int s,int mid,int e){
        int[] arr1 = new int[mid-s+1];
        int[] arr2 = new int[e-mid];
        //coping the element in two array
        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[i+s];
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j] = arr[mid+1+j]; // second array is starting from mid+1
        }
        // merge two sorted array
        int t=s;
        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]>=arr2[j]){
                arr[t++]=arr2[j++];
            }else{
                arr[t++]=arr1[i++];
            }
        }
        while (i<arr1.length) { // arr2 is empty
            arr[t++] = arr1[i++];
        }
        while (j<arr2.length) {  // arr1 is empty
            arr[t++] = arr2[j++];
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,1,2,8};
        System.out.print("Before Sorting : ");
        print(arr);
        solve(arr, 0, arr.length-1);
        System.out.print("After Sorting : ");
        print(arr);
    }
    
}
