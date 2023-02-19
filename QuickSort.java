import java.util.Random;

public class QuickSort {
    private static void swap(int[] arr , int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }


    private static void quickSort(int[] array , int lowIdx , int highIdx){

        if(lowIdx >= highIdx){
            return;
        }

        int pivotIdx = new Random().nextInt(highIdx - lowIdx) + lowIdx;
        int pivot = array[pivotIdx];
        swap(array , pivotIdx , highIdx);


        int leftPointer = lowIdx;
        int rightPointer = highIdx;

        while (leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(array[rightPointer]>= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array , leftPointer , rightPointer);
        }


        swap(array , leftPointer , highIdx);
        quickSort(array , lowIdx , leftPointer -1);
        quickSort(array , leftPointer + 1 , highIdx);
    }

    private static void quickSort(int[] arr){
        quickSort(arr , 0  , arr.length - 1);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100000];
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        quickSort(arr);

        for (int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
