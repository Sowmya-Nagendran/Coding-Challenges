// Product of maximum in first array and minimum in second ---> Basic problem

class Solution {
    
    /**
     * This method finds the maximum value in the first array and the minimum value in the second array,
     * then returns the multiplication of these two values.
     * 
     * @param arr the first input array of integers
     * @param brr the second input array of integers
     * @param n the size of the first array
     * @param m the size of the second array
     * @return the multiplication of the maximum value from the first array and the minimum value from the second array
     */
    public static long find_multiplication(int arr[], int brr[], int n, int m) {
        // Initialize the maximum value to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        
        // Initialize the minimum value to the largest possible integer value
        int min = Integer.MAX_VALUE;
        
        // Loop through the first array to find the maximum value
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        
        // Loop through the second array to find the minimum value
        for (int i = 0; i < m; i++) {
            if (min > brr[i]) {
                min = brr[i]; // Update min if current element is smaller
            }
        }
        
        // Calculate the multiplication of max and min
        int output = max * min;
        
        // Return the result
        return output;
    }
}
