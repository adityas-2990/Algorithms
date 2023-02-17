public class BinarySearch_Recursive {
    public static int rBinSearch(int[] A , int hi , int lo , int key){

            int mid = (hi + lo)/2;
            if (key == A[mid]){
                return mid;
            } else if (key < A[mid]) {
                return rBinSearch(A , mid-1  , lo , key);
            }else if(key > A[mid]){
                return rBinSearch(A, hi, mid + 1, key);
            }

            return -1;
    }
    public static void main(String[] args) {

        int[] Arr = {3 , 6 , 8 , 12 , 14 , 17 , 25 , 29 , 31 , 36 , 42 , 47 , 53 , 55 , 62 };
        System.out.println(rBinSearch(Arr , Arr.length - 1 , 0 , 25) + 1);

    }
}
