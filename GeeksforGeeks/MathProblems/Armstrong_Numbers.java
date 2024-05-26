// Armstrong number ---> Easy Problem

class Solution {
    static String armstrongNumber(int n) {
        // Save the original number for later comparison
        int m = n;
        
        // Initialize sum to store the sum of the cubes of the digits
        int sum = 0;
        
        // Loop to process each digit of the number
        while(n > 0) {
            // Extract the last digit of the number
            int r = n % 10;
            
            // Add the cube of the extracted digit to the sum
            sum += (int) Math.pow(r, 3);
            
            // Remove the last digit from the number
            n = n / 10;
        }
        
        // Check if the sum of the cubes of the digits is equal to the original number
        if(sum == m) {
            // If true, the number is an Armstrong number
            return "Yes";
        }
        
        // If false, the number is not an Armstrong number
        return "No";
    }
}
