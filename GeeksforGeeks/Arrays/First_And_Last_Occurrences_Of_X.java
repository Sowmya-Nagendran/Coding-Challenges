// First and last occurrences of X ---> Basic problem

class Solution {
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        // Create a new ArrayList to store the results
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1); // Add initial value at index 0 to represent "not found"

        // Search for the first occurrence of x
        result.set(0, search(arr, x, true));

        // If the first occurrence of x is found, search for the last occurrence of x
        if (result.get(0) != -1) {
            result.add(search(arr, x, false)); // Add the last occurrence index at index 1
        }
        
        // Return the result ArrayList
        return result;
    }

    /**
     * This function performs a modified binary search to find either the first or the last occurrence of a target value (x) in a sorted array (arr).
     * 
     * @param arr the sorted array in which to search
     * @param x the target value to search for
     * @param findStartIndex a boolean flag indicating whether to find the first occurrence (true) or the last occurrence (false) of x
     * @return the index of the first or last occurrence of x, or -1 if x is not found
     */
    int search(int[] arr, int x, boolean findStartIndex) {
        int ans = -1; // Variable to store the result index
        int start = 0; // Starting index of the search range
        int end = arr.length - 1; // Ending index of the search range
        
        // Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            
            // If x is less than the middle element, search in the left half
            if (x < arr[mid]) {
                end = mid - 1;
            }
            // If x is greater than the middle element, search in the right half
            else if (x > arr[mid]) {
                start = mid + 1;
            }
            // If x is equal to the middle element, update the result index
            else {
                ans = mid;
                // If searching for the first occurrence, move to the left half
                if (findStartIndex) {
                    end = mid - 1;
                }
                // If searching for the last occurrence, move to the right half
                else {
                    start = mid + 1;
                }
            }
        }
        
        // Return the result index
        return ans;
    }
}
