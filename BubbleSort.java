public class BubbleSort {
    public static void bubbleSort(int[] A){
        int n = A.length;
        for(int i = 0 ; i < n- 1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
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
        bubbleSort(Arr);
        printArray(Arr);


    }
}
