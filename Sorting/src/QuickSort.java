public class QuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp =arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void sort(int[] arr,int low,int high){
        if (low<high){
            int s = partition(arr,low,high);
            sort(arr,low,s-1);
            sort(arr,s+1,high);

        }
    }
    public static void main(String[] args) {
        int arr[]= {5,3,1,9,8,2,4,7};
        sort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
