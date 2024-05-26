// Prime Number ---> Basic problem

class Solution {
    static int isPrime(int N) {
        // If the number is less than or equal to 1, it is not prime.
        // Return 0 (indicating false).
        if (N <= 1) {
            return 0;
        }
        
        // If the number is 2 or 3, it is prime.
        // Return 1 (indicating true).
        if (N <= 3) {
            return 1;
        }
        
        // If the number is divisible by 2 or 3, it is not prime.
        // Return 0 (indicating false).
        if (N % 2 == 0 || N % 3 == 0) {
            return 0;
        }
        
        // Start checking from 5 and increment by 6 each time.
        // This check is based on the fact that all prime numbers
        // greater than 3 can be written in the form 6k ± 1.
        for (int i = 5; i * i <= N; i += 6) {
            // If the number is divisible by i or (i + 2),
            // it is not prime. Return 0 (indicating false).
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0;
            }
        }
        
        // If none of the above conditions were met, the number is prime.
        // Return 1 (indicating true).
        return 1;
    }
}
