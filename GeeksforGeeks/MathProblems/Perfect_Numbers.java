// Prefect numbers ---> Easy problem

class Solution {
    // Method to check if a number is a perfect number
    static int isPerfectNumber(long N) {
        // If N is less than or equal to 1, it cannot be a perfect number, return 0
        if (N <= 1) return 0;
        
        long sum = 1; // Initialize sum to 1 as 1 is a proper divisor of any number greater than 1
        
        // Loop through all numbers from 2 to the square root of N
        for (long i = 2; i * i <= N; i++) {
            // If i is a divisor of N
            if (N % i == 0) {
                sum += i; // Add i to the sum
                
                // If i is not equal to N / i, then N / i is also a divisor of N
                // Add N / i to the sum
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }
        
        // If the sum of all proper divisors of N equals N, then N is a perfect number, return 1
        // Otherwise, return 0
        return sum == N ? 1 : 0;
    }
};
