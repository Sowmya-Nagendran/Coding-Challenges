// Searching a number ---> Basic problem

class Solution {
    public static int search(int n, int k, int[] arr) {
        
        // Initialize a variable to store the index of the element if found.
        // Set to -1 initially, which will be returned if the element is not found.
        int ans = -1;
        
        // Iterate through the array from the beginning to the end.
        for(int i = 0; i < n; i++) {
            
            // Check if the current element is equal to the target value k.
            if(arr[i] == k) {
                
                // If the element is found, store the 1-based index (i + 1) in ans.
                ans = i + 1;
                
                // Exit the loop as we have found the target element.
                break;
            }
        }
        
        // Return the result. If the element was found, ans will be the 1-based index.
        // If not found, ans will remain -1.
        return ans;
    }
}
