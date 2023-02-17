import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int [] arr , int key){
        int isFound = 0;
        for (int j : arr) {
            if (j == key) {
                isFound = 1;
                break;
            }
        }
        if(isFound == 1){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = input.nextInt();

        int [] Arr = new int[n];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            Arr[i] = input.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = input.nextInt();

        if(linearSearch(Arr , key) == 1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }
}
