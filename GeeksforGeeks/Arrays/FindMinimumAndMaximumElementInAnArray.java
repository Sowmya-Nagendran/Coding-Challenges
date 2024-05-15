// Find Minimum And Maximum Element In An Array ---> Basic Problem

// User function Template for Java

/*
class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;
        this.second = second;
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum, maximum)
*/

class Solution {

    // Function to get the minimum and maximum values from an array
    static Pair getMinMax(long a[], long n) {
        // Initialize max to the smallest possible long value
        long max = Long.MIN_VALUE;
        // Initialize min to the largest possible long value
        long min = Long.MAX_VALUE;

        // Loop to find the maximum value in the array
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i]; // Update max if current element is greater
            }
        }

        // Loop to find the minimum value in the array
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i]; // Update min if current element is smaller
            }
        }

        // Return a Pair containing the minimum and maximum values
        return new Pair(min, max); // returning to a function
    }
}
