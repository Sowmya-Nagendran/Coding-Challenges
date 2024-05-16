// Multiply left and right array sum ---> Basic problem

class Complete {
    
    // Function for finding the product of sums of two halves of the array
    public static int multiply(int arr[], int n) {
        // Initialize the start index to 0 and end index to n-1
        int start = 0;
        int end = n - 1;
        // Initialize sum variables for the two halves of the array
        int sum = 0;
        int sum1 = 0;
        
        // Check if the number of elements in the array is odd
        if (n % 2 != 0) {
            // Calculate the middle index for an odd-sized array
            int mid = start + (end - start) / 2;
            // Sum elements from the start to one element before the middle
            for (int i = start; i <= mid - 1; i++) {
                sum += arr[i];
            }
            // Sum elements from the middle to the end of the array
            for (int i = mid; i <= end; i++) {
                sum1 += arr[i];
            }
            // Return the product of the two sums
            return sum * sum1;
        }
        
        // Calculate the middle index for an even-sized array
        int mid = start + (end - start) / 2;
        // Sum elements from the start to the middle
        for (int i = start; i <= mid; i++) {
            sum += arr[i];
        }
        // Sum elements from one element after the middle to the end of the array
        for (int i = mid + 1; i <= end; i++) {
            sum1 += arr[i];
        }
        // Return the product of the two sums
        return sum * sum1;
    }
}
