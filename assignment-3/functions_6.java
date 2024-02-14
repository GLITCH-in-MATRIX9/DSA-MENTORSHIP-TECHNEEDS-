import java.util.Scanner;

public class functions_6 {
    public static int linearSearch(int n, int num, int[] arr) {
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element matches 'num', return its index
            if (arr[i] == num) {
                return i;
            }
        }
        // If 'num' is not found in the array, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        System.out.println("enter the numbr to find in the array");
        int num = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number to be added in the array");
            arr[i] = sc.nextInt();

        }
        int index=linearSearch(n, num, arr);
        if(index>0){
            System.out.println("Element not found at any index ");
        }else{
            System.out.println("Element found at index "+index);
        } 
       
    }
}
