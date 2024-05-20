// Left most and right most index ---> Easy problem

// User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x) {
        // This method finds the first and last indexes of the element 'x' in the array 'v'

        // Initialize 's' to store the first occurrence index and 'm' to store the last occurrence index
        long s = -1; // Start with -1, assuming 'x' is not found initially
        long m = -1; // Start with -1, assuming 'x' is not found initially

        // Loop to find the first occurrence of 'x'
        for(int i = 0; i < v.length; i++) {
            if(v[i] == x) {
                s = i; // Store the index of the first occurrence
                break; // Break the loop once the first occurrence is found
            }
        }

        // Loop to find the last occurrence of 'x'
        for(int i = 0; i < v.length; i++) {
            if(v[i] == x) {
                m = i; // Continuously update 'm' to store the latest found index
            }
        }

        // Return a new pair with 's' as the first occurrence index and 'm' as the last occurrence index
        return new pair(s, m);
    }
}
