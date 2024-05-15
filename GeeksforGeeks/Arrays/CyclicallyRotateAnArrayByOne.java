class Compute {

    // Function to rotate the array elements to the right by one position.
    public void rotate(int arr[], int n) {
        // This program will rotate all elements to the back except the last element.
        n -= 1; // Decrement n by 1 to adjust for zero-based index (set n to 4 for 5 elements).

        // Loop through the array to perform the rotation n times.
        for (int i = 0; i < n; i++) { // i=0 to i<4; so the elements at indices 0, 1, 2, and 3 will be rotated to the back.
            // Store the first element temporarily.
            int first = arr[0];
            int j;

            // Shift all elements one position to the left.
            for (j = 0; j < n; j++) {
                arr[j] = arr[j + 1];
            }

            // Place the first element at the end of the array.
            arr[j] = first;
        }
    }
}
