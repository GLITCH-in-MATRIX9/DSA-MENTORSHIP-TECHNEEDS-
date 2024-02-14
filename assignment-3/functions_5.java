class functions_5 {
    public static void moveZeroes(int[] nums) {
        // Pointer for the next position to place a non-zero element
        int nextNonZeroPos = 0;
        // Pointer for iterating through the array
        int currentIndex = 0;
        
        // Loop through the array
        while (currentIndex < nums.length) {
            // If the current element is non-zero
            if (nums[currentIndex] != 0) {
                // Move the non-zero element to the next available position
                // (which is determined by the nextNonZeroPos pointer)
                int temp = nums[nextNonZeroPos];
                nums[nextNonZeroPos] = nums[currentIndex];
                nums[currentIndex] = temp;
                // Move the pointer for the next non-zero position forward
                nextNonZeroPos++;
            }
            // Move to the next element in the array
            currentIndex++;
            
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
       
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,0,8,0,5,2};
        moveZeroes(arr);

    }
}

