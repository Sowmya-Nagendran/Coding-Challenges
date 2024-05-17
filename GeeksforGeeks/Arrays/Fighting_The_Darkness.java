// Fighting the darkness ---> Basic problem

class Solution{
    // Method to find the maximum value in the array
    long maxDays(long arr[], int n){
        // Initialize max with the smallest possible value
        long max = Integer.MIN_VALUE;

        // Iterate through the array to find the maximum value
        for(int i = 0; i < n; i++){
            // If the current element is greater than max, update max
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Return the maximum value found in the array
        return max;
    }
}
