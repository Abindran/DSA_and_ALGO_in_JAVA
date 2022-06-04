public class BubbleSort {
    public void printArray(int arr[]){
        System.out.println("The array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j+1] < arr[j]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{2,1,9,4,6,3,9};
        BubbleSort obj = new BubbleSort();
        obj.sort(arr);
        obj.printArray(arr);
    }
}
