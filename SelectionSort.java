public class SelectionSort {
    public static void selectionSort(int[] A){
        for (int i = 0 ; i < A.length - 1 ; i++){
            int minIdx = i;
            for(int j = i+1 ; j < A.length ; j++){
                if (A[j] < A[minIdx]){
                    minIdx = j;
                }
            }

            int temp = A[minIdx];
            A[minIdx] = A[i];
            A[i] = temp;
        }
    }

    public static void printArray(int [] A){
        for(int i = 0 ; i < A.length ; i++){
            System.out.println(A[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] Arr = {4 , 6, 10,1 , 9 , 5};
        selectionSort(Arr);
        printArray(Arr);

    }
}
