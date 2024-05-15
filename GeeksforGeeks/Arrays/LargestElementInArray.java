// Largest Element In Array ---> Basic problem

class Compute {

    // Method to find the largest element in the array
    public int largest(int arr[], int n) {
        // Initialize max with the first element of the array
        int max = arr[0];
        
        // Loop through the array to find the maximum element
        for(int i = 0; i < n; i++) {
            // If the current element is greater than max, update max
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Return the maximum element found
        return max;
    }
}
