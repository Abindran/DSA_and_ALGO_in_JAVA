import java.util.Arrays;

// 5 3 2 3 6 1
// 1 2 3 3 5 6
public class CountingSort {
    public static int[] remove(int[] arr,int i){
        if(arr==null || i <0 || i>= arr.length) return arr;

        int[] anotherArray = new int[arr.length-1];

        for(int j=0,k=0;j<arr.length;j++){
            if(j == i){
                continue;
            }
            anotherArray[k++] = arr[j];
        }
        return anotherArray;
    }
    public static void main(String[] args){
        int arr[] = {5,3,2,3,6,1};
        int max = Arrays.stream(arr).max().getAsInt();
        int count[] = new int[max+1];

        for (int i : arr){
            count[i]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            while( count[i] > 0){
                arr[k++] = i;
                count[i]--;
            }
        }
        for (int m=0;m<arr.length;m++){
            System.out.println(arr[m]);
        }


    }
}
