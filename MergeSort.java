import java.util.Random;

public class MergeSort {

    private static void merge(int[] Arr , int[] leftHalf , int[] rightHalf ){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0 , j= 0 , k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                Arr[k] = leftHalf[i];
                i++;
            }else {
                Arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            Arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize){
            Arr[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    private static void mergeSort(int[] Arr){
        int n = Arr.length;

        if(n < 2){
            return;
        }

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = Arr[i];
        }

        for (int i = mid; i < n ; i++) {
            right[i  - mid] = Arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        //Merge
        merge(Arr , left , right);

    }


    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100000];
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        mergeSort(arr);

        for (int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}