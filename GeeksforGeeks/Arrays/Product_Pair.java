// Product pair ---> Easy problem

class Solution {
    // Method to check if there exists a pair of numbers in the array whose product is equal to x
    boolean isProduct(int[] arr, int n, long x) {
        // Initialize an ArrayList to store visited numbers and their corresponding divisors
        ArrayList<Long> list = new ArrayList<>();
        
        // Iterate through each number in the array
        for (long num : arr) {
            // If the current number is 0 and x is also 0, then a pair (0, 0) satisfies the condition
            if (num == 0) {
                if (x == 0)
                    return true;
                else
                    continue; // Skip further processing for 0, move to the next number
            }
            
            // If the current number is a divisor of x and the result of division is present in the list,
            // then there exists a pair whose product is equal to x
            if (x % num == 0 && list.contains(x / num)) {
                return true;
            }
            
            // Add the current number to the list for future reference
            list.add(num);
        }
        
        // If no such pair is found, return false
        return false;
    }
}
