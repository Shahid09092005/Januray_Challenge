public class insertion {
    
    //print
    public static void print(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
// main
    public static void main(String[] args) {
        int[] arr = {6,2,1,3,5};
        System.out.print("Before Sorting : ");
        print(arr);
        //logic
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    System.out.print("After Sorting : ");
    print(arr);
    }
}
