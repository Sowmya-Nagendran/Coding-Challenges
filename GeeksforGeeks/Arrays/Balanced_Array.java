// Balanced array ---> Basic problem

class Solution {
    /**
     * This method calculates the minimum value required to balance the sums of two halves of the array.
     * 
     * @param a the input array of long integers
     * @param n the size of the array
     * @return the absolute difference between the sums of the two halves of the array
     */
    long minValueToBalance(long a[], int n) {
        // Initialize start and end pointers to the beginning and end of the array
        int start = 0;
        int end = n - 1;

        // Calculate the mid-point of the array
        int mid = start + (end - start) / 2;

        // Variables to store the sums of the two halves
        long sum = 0;
        long sum1 = 0;

        // Calculate the sum of the first half of the array
        for (int i = start; i <= mid; i++) {
            sum += a[i];
        }

        // Calculate the sum of the second half of the array
        for (int i = mid + 1; i < n; i++) {
            sum1 += a[i];
        }

        // Calculate the difference between the two sums
        long ans = sum - sum1;

        // Ensure the result is positive (absolute value)
        if (ans < 0) {
            ans = -1 * ans;
        }

        // Return the absolute difference
        return ans;
    }
}
