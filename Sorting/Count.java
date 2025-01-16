public class count {
     //swap function
     public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    //print
    public static void print(int[]arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
// main
    public static void main(String[] args) {
        int arr[] = {5,5,5,5,3,2,3,1,2,2,1,1};
        System.out.print("Before Sorting : ");
        print(arr);
        int max=0;
        // calculating maximum element in the array
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        System.out.println("Maximum element in the given array is "+max);
        // initiazizing auxilary space
        int[] freqArr = new int[max+1];
        for(int i=0;i<arr.length;i++){
            freqArr[arr[i]]++;
        }
        //
        System.out.print("freq array is ");
        print(freqArr);
        // sorting
        int temp=0;
        for(int j=0;j<freqArr.length;j++){
            while (freqArr[j]>0) {
                arr[temp++]= j;
                freqArr[j]--;
            }
        }
        System.out.print("After sorting ");
        print(arr);
        
    }
}
