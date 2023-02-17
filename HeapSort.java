public class HeapSort {

    public void sort(int arr[]){
        int n = arr.length;

        for(int i = n/2 - 1 ; i>= 0 ; i--){
            heapify(arr , n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr , i , 0);
        }

    }

    void heapify (int[] arr , int n , int i){
        int largest = i;
        int leftChild = 2*i +1;
        int rightChild = 2*i +2;

        if(leftChild < n && arr[leftChild] > arr[largest] ){
            largest = leftChild;
        }

        if(rightChild < n && arr[rightChild] > arr[largest] ){
            largest = rightChild;
        }

        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
        }

        heapify(arr, n, largest);
    }

    static void printArray(int arr[]){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int A[]= {6 , 5 };

        HeapSort ob = new HeapSort();
        ob.sort(A);

        System.out.println("Sorted Array is: ");
        printArray(A);
    }

}
