// Elements in the range ---> Basic Problem

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        // Create a boolean array to keep track of the presence of numbers between A and B
        boolean[] present = new boolean[B - A + 1];

        // Iterate over the given array to mark the presence of elements in the range [A, B]
        for (int i = 0; i < n; i++) {
            int num = arr[i];  // Get the current element from the array

            // Check if the current element is within the range [A, B]
            if (num >= A && num <= B) {
                // Mark the presence of this element in the boolean array
                present[num - A] = true;
            }
        }

        // Check if all elements from A to B are present
        for (int i = A; i <= B; i++) {
            // If any element in the range [A, B] is not marked as present, return false
            if (!present[i - A]) {
                return false;
            }
        }

        // If all elements from A to B are present, return true
        return true;
    }
}
