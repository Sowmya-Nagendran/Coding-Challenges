// Immediate Smaller Element ---> Basic Problem

class Solution {
    
    // Method to replace every element with the next immediate smaller element in the array.
    void immediateSmaller(int arr[], int n) {
        // Iterate through the array up to the second last element
        for(int i = 0; i < n - 1; i++) {
            // If the current element is greater than the next element
            if(arr[i] > arr[i + 1]) {
                // Replace the current element with the next element
                arr[i] = arr[i + 1];
            } else {
                // Otherwise, set the current element to -1
                arr[i] = -1;
            }
        }
        // Set the last element to -1 as there is no next element
        arr[n - 1] = -1;
    }
}
