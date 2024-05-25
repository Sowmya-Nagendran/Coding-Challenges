// Count digits ---> Easy problem

class Solution {
    // Method to count the number of digits in N that evenly divide N
    static int evenlyDivides(int N) {
        // Store the original number in 'sum' to use it for division checks
        int sum = N;
        
        // Initialize count to 0 to keep track of the number of digits that evenly divide N
        int count = 0;
        
        // Loop to process each digit of the number N
        while (N > 0) {
            // Get the last digit of N
            int r = N % 10;
            
            // Check if the digit is not zero and it divides the original number 'sum' evenly
            if (r != 0 && sum % r == 0) {
                // Increment count if the condition is true
                count++;
            }
            
            // Remove the last digit from N by dividing it by 10
            N = N / 10;
        }
        
        // Return the count of digits that evenly divide the original number
        return count;
    }
}
