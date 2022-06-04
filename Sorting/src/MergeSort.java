//9 8 2 3 6 5
// 2 3 5 6 8 9
public class MergeSort {

    public void merge(int arr[],int low,int mid,int high){
        int s1 = mid - low +1;
        int s2 = high - mid;
        int[] left = new int[s1];
        int[] right = new int[s2];
        for (int i=0;i<s1;++i){
//            System.out.println(i);
            left[i] = arr[low+i];
        }
        for(int j=0;j<s2;++j){
//            System.out.println(j);
            right[j] = arr[mid+1+j];
        }

        int i = 0,j=0,k= low;
        while(i<s1 && j<s2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        if(i>=s1){
            for (int l=0;l<s2;l++){
                arr[k] = right[l];
                k++;
            }
        }else{
            for(int m=0;m<s1;m++){
                arr[k] = left[m];
                k++;
            }
        }
    }

    public void mergeSort(int arr[],int low,int high){

        if(arr.length>1 && low<high) {
            int mid = (low+high) / 2;
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            mergeSort(arr,low,mid);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            mergeSort(arr,mid+1,high);
//            System.out.println("\nPassed array is: ");
//            for(int i=0;i<arr.length;i++){
//                System.out.print(arr[i] + " ");
//            }
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args){
        int arr[]  = {9,8,2,3,6,5};
        MergeSort obj = new MergeSort();
        obj.mergeSort(arr,0,arr.length);
        System.out.println(arr);
    }
}
