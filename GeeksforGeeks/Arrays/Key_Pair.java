// Key pair ---> Easy problem

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // This method checks if there are two numbers in the array 'arr' that sum up to 'x'
        
        // First, sort the array to enable the two-pointer approach
        Arrays.sort(arr);
        
        // Initialize two pointers, 'left' at the start and 'right' at the end of the array
        int left = 0;
        int right = n - 1;
        
        // Use a while loop to check pairs of elements
        while (left < right) {
            // Calculate the sum of the elements at the current pointers
            int sum = arr[left] + arr[right];
            
            // If the sum is equal to 'x', we found a pair that sums up to 'x'
            if (sum == x) {
                return true;
            }
            // If the sum is greater than 'x', move the 'right' pointer to the left to decrease the sum
            else if (sum > x) {
                right--;
            }
            // If the sum is less than 'x', move the 'left' pointer to the right to increase the sum
            else {
                left++;
            }
        }
        
        // If no such pair is found, return false
        return false;
    }
}
