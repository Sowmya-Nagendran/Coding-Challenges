// Index of first 1 in a sorted array of 0s and 1s ---> Basic problem

class Solution {

    // Method to find the first index of the element 1 in the array
    public long firstIndex(long arr[], long n) {
        // Loop through the array from the beginning to the end
        for(int i = 0; i < n; i++) {
            // Check if the current element is 1
            if(arr[i] == 1) {
                // If found, return the index of the first occurrence of 1
                return i;
            }
        }
        // If 1 is not found in the array, return -1
        return -1;
    }
}
