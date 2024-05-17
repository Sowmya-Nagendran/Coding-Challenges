// Ceil the floor

import java.util.Arrays;

class Solve {

    // Method to find the floor and ceiling of a given number x in a sorted array
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // Sort the array
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int ceil = -1;  // Initialize ceil as -1 (not found)
        int floor = -1; // Initialize floor as -1 (not found)

        // Perform binary search to find floor and ceil
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the mid index

            if (arr[mid] == x) {
                // If the element at mid is equal to x, both floor and ceil are x
                floor = arr[mid];
                ceil = arr[mid];
                break; // Exit the loop as we found the exact match
            } else if (arr[mid] > x) {
                // If the element at mid is greater than x, update ceil and move to the left half
                ceil = arr[mid];
                end = mid - 1;
            } else {
                // If the element at mid is less than x, update floor and move to the right half
                floor = arr[mid];
                start = mid + 1;
            }
        }

        // Return a pair containing the floor and ceil
        return new Pair(floor, ceil);
    }
}
