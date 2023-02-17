public class BinarySearch {
    public static int binarySearch(int[] A , int size , int key){
        int hi = size ;
        int lo = 0;

        while (lo <= hi){
            int mid = (hi + lo)/2;
            if(key == A[mid]){
                return mid;
            }else if(key < A[mid]){
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] Arrray = {3 , 6 , 8 , 12 , 14 , 17 , 25 , 29 , 31 , 36 , 42 , 47 , 53 , 55 , 62 };
        if(binarySearch(Arrray , Arrray.length , 31 ) == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at position " + binarySearch(Arrray , Arrray.length , 31) );
        }
    }
}
