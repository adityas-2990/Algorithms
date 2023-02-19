public class InsertionSort {
    public static void insertionSort(int[] A){
        int key , j;
        for(int i = 0 ; i < A.length ; i++){
            key = A[i];
            j = i-1;
            while (j >= 0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }

            A[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] A = {3 , 6, 2,7 ,8,1 ,8};
        insertionSort(A);

        for(int i = 0 ; i < A.length ; i++){
            System.out.println(A[i]);
        }
    }
}
