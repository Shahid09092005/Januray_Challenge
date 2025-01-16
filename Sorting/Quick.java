public class Quick {
    //print
    public static void print(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    //swap
    public static void swap(int[] arr , int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    // pivot 
    public static int pivot(int[] arr,int st,int end){
        // taking first element is pivot element
        int piv_ele=arr[st];
        // counting how many element are equal or less than pivot element
        int c=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=piv_ele){
                c++;
            }
        }
        // Place the pivot at the correct position
        swap(arr, st, c+st);
        // now moving element to their correct position means less than on left side and larger in right side of pivot element
        int piv_idx = c+st;
        int i=st;
        int j=end;
        while (i<piv_idx && j>piv_idx) {
            while(arr[i]<piv_ele) i++;
            while (arr[j]>piv_ele) j--;
            swap(arr, i, j);
            i++;
            j--;
        }
        // returning index of pivot element
        return piv_idx;
    }
    
    //solve
    public static void solve(int[] arr ,int st,int end){
        if(st<end){
            int piv_idx = pivot(arr, st, end);
            solve(arr, st, piv_idx-1);
            solve(arr, piv_idx+1, end);
        }
    }

//main
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,1,2,8};
        System.out.print("Before Sorting : ");
        print(arr);
        solve(arr, 0, arr.length-1);
        System.out.print("After Sorting : ");
        print(arr);
    }
    
}
