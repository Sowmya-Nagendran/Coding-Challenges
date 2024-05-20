// Mega sale ---> Basic Problem

import java.util.Arrays;

class Compute {

    public static long maxProfit(int a[], int n, int m) {
        // Initialize the profit to 0
        long profit = 0;

        // Sort the array in ascending order
        Arrays.sort(a);

        // Iterate through the array to maximize profit by flipping negative values
        for (int i = 0; i < n; i++) {
            // If there are flips remaining and the current element is negative
            if (m > 0 && a[i] < 0) {
                // Add the negative value to profit (since flipping it will reduce the loss)
                profit += a[i];
                // Decrement the count of remaining flips
                m--;
            }
        }

        // If the total profit is negative, return its absolute value to represent the gain
        // Otherwise, return the profit as is
        return profit < 0 ? -profit : profit;
    }
}
