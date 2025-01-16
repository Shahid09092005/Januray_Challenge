public class selection {
    //swap function
    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    //print
    public static void print(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.print("Before Swapping ");
        print(arr);
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int idx = i; // assuming that first element is small
            for(int j=i+1;j<len;j++){
                if(arr[idx]>arr[j]){
                    idx=j;
                }
            }
            swap(arr, i, idx);
        }
        //print
        System.out.print("After Swapping ");
        print(arr);  
    }
    
}
