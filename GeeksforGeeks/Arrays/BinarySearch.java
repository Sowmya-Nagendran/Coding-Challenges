// Binary Search --> Basic Problem

class Solution {
    // Method to perform binary search on a sorted array
    int binarysearch(int arr[], int n, int k) {
        int start = 0;       // Initialize start index
        int end = n - 1;     // Initialize end index
    
        // Loop until the start index is less than or equal to the end index
        while (start <= end) {
            // Calculate the mid index to avoid overflow
            int mid = start + (end - start) / 2;

            // If the key is less than the mid element, search in the left half
            if (k < arr[mid]) {
                end = mid - 1;
            }
            // If the key is greater than the mid element, search in the right half
            else if (k > arr[mid]) {
                start = mid + 1;
            }
            // If the key is equal to the mid element, return the mid index
            else {
                return mid;
            }
        }
        // If the element is not found, return -1
        return -1;
    }
}
