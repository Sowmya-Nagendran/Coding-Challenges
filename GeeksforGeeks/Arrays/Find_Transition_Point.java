// Find transition point ---> Easy problem

class Solution {

    // Function to find the transition point in the array
    // A transition point is where 0 changes to 1 in a sorted array
    // If no 1 is found, the function returns -1
    int transitionPoint(int arr[], int n) {
        // Initialize the answer variable to -1
        // This will be the default return value if no transition point is found
        int ans = -1;

        // Iterate through the array from the beginning to the end
        for(int i = 0; i < n; i++) {
            // Check if the current element is 1
            if(arr[i] == 1) {
                // If a 1 is found, set the answer to the current index
                ans = i;
                // Break the loop as we have found the first transition point
                break;
            }
        }

        // Return the index of the first occurrence of 1, or -1 if no 1 is found
        return ans;
    }
}
