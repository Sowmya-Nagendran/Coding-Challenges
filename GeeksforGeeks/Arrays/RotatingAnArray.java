// Rotating an array ---> Basic problem

class Solution {

    // Function to left rotate an array 'arr' of size 'n' by 'd' positions.
    void leftRotate(int[] arr, int n, int d) {
        // Reverse the first 'd' elements
        reverseArray(arr, 0, d - 1);
        // Reverse the remaining 'n - d' elements
        reverseArray(arr, d, n - 1);
        // Reverse the entire array to achieve the left rotation
        reverseArray(arr, 0, n - 1);
    }

    // Helper function to reverse elements of the array from index 'start' to 'end'.
    void reverseArray(int[] arr, int start, int end) {
        // Continue swapping elements until the start index is less than the end index
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move the start index forward and the end index backward
            start++;
            end--;
        }
    }
}
