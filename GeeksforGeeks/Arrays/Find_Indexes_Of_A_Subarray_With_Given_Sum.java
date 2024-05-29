// Find indexes of a subarray with given sum ---> Medium problem

class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Initialize an ArrayList to store the result
        ArrayList<Integer> ans = new ArrayList<>();
        // Variable to store the current sum of elements in the sub-array
        int sum = 0;
        // Variable to track the start index of the sub-array
        int start = 0;
        
        // Iterate through the array elements
        for (int i = 0; i < n; i++) {
            // Add the current element to the sum
            sum += arr[i];
            
            // If the sum exceeds the given target 's'
            while (sum > s) {
                // Remove elements from the start of the sub-array until the sum becomes less than or equal to 's'
                sum -= arr[start];
                start++;
            }
            
            // If the current sub-array's sum equals 's' and the start index is less than or equal to the current index
            if (sum == s && start <= i) {
                // Add the start index of the sub-array (1-based indexing) to the result
                ans.add(start + 1);
                // Add the end index of the sub-array (1-based indexing) to the result
                ans.add(i + 1);
                // Return the result
                return ans;
            }
        }
        
        // If no sub-array with sum equal to 's' is found, add -1 to the result
        ans.add(-1);
        // Return the result
        return ans;
    }
}
