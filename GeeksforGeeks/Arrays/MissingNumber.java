// Missing number ---> Basic problem

class Solution {
    
    // Method to find the missing number in an array containing numbers from 1 to n
    public static int missingNumber(int n, int[] arr) {
        // Initialize the index to 0
        int i = 0;

        // Loop through the array to place each number at its correct position
        while (i < arr.length) {
            // Calculate the correct position for the current element
            int correct = arr[i] - 1;

            // If the current element is within the valid range and not in its correct position, swap it
            if (correct >= 0 && correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                // Move to the next element
                i++;
            }
        }

        // Loop through the array to find the first missing number
        for (int index = 0; index < arr.length; index++) {
            // If the current element is not in its correct position, return the missing number
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // If all elements are in their correct positions, return the next number (n+1)
        return arr.length + 1;
    }

    // Helper method to swap two elements in the array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
