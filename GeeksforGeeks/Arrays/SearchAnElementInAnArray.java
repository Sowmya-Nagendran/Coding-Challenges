class Solution {

    // Function to search for an element X in an array arr[] of size N.
    static int search(int arr[], int N, int X) {

        // Loop through the array from the beginning to the end.
        for (int i = 0; i < N; i++) {
            // If the current element matches the element X, return its index.
            if (arr[i] == X) {
                return i;
            }
        }

        // If the element X is not found in the array, return -1.
        return -1;
    }

}
