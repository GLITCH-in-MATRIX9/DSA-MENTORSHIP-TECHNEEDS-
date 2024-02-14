
public class functions_8 {

    static int largestElement(int[] arr, int n) {
        int max = arr[0];

        // sorting the array first
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 6, 4, 2, 8 };
        int n = arr.length;
        int maximum = largestElement(arr, n);
        System.out.println("maximum number is " + maximum);

    }
}