public class functions_7 {
    public int missingNumber(int[] nums) {
        // Calculate the sum of numbers in the range [0, n]
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of numbers in the array nums
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Return the missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        functions_7 solution = new functions_7();
        int[] nums = { 3, 0, 1 };
        System.out.println("Missing number: " + solution.missingNumber(nums)); 
    }
}
