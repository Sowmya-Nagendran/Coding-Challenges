// Ishaan loves chocolates ---> Basic problem

class Solution {
    // Method to find the minimum number of chocolates in an array
    public static int chocolates(int n, int[] arr) {

        // Initialize the minimum value to the maximum possible integer value
        int min = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum element
        for(int i = 0; i < n; i++){
            // If the current element is less than the current minimum, update the minimum
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // Return the minimum value found
        return min;
    }
}
