// Find the fine ---> Basic problem

class Solution {
    
    /**
     * This method calculates the total fine based on the date and the parity of car numbers.
     * If the date is even, it sums the fines for cars with odd numbers.
     * If the date is odd, it sums the fines for cars with even numbers.
     * 
     * @param n the number of cars
     * @param date the current date
     * @param car an array containing the car numbers
     * @param fine an array containing the fine amounts corresponding to each car number
     * @return the total fine calculated based on the given conditions
     */
    public long totalFine(long n, long date, long car[], long fine[]) {
        // Initialize variables to store the total fines
        long sum = 0;   // For fines when the date is even
        long sum1 = 0;  // For fines when the date is odd

        // Check if the date is even
        if (date % 2 == 0) {
            // Loop through the cars to sum fines for odd-numbered cars
            for (int i = 0; i < n; i++) {
                if (car[i] % 2 != 0) { // Check if the car number is odd
                    sum += fine[i]; // Add the fine to sum if the car number is odd
                }
            }
            // Return the total fine for odd-numbered cars
            return sum;
        }
        
        // If the date is odd, loop through the cars to sum fines for even-numbered cars
        for (int i = 0; i < n; i++) {
            if (car[i] % 2 == 0) { // Check if the car number is even
                sum1 += fine[i]; // Add the fine to sum1 if the car number is even
            }
        }
        
        // Return the total fine for even-numbered cars
        return sum1;
    }
}
