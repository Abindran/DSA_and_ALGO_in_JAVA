public class SelectionSort {
    public void printArray(int arr[]){
        System.out.println("The array is: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sort(int arr[]){
        int min;
        for (int i=0;i<arr.length-1;i++){
            min = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{2,1,9,4,6,3,9};
        SelectionSort obj = new SelectionSort();
        obj.sort(arr);
        obj.printArray(arr);
    }
}
