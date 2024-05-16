// Find the smallest and second smallest element in an array ---> Basic problem

class Compute 
{
    // Method to find the smallest and second smallest elements in the array
    public long[] minAnd2ndMin(long a[], long n)  
    {
        // Check if the array has less than 2 elements
        if(n < 2){
            // If there are less than 2 elements, return {-1, -1}
            return new long[]{-1, -1};
        }

        // Sort the array
        Arrays.sort(a);

        // Initialize the smallest element to the first element of the sorted array
        long s = a[0];

        // Initialize the second smallest element to -1 (default value indicating not found)
        long s2 = -1;

        // Loop through the sorted array starting from the second element
        for(int i = 1; i < n; i++){
            // If the current element is greater than the smallest element
            if(a[i] > s){
                // Assign the current element as the second smallest element
                s2 = a[i];
                // Break the loop as we have found the second smallest element
                break;
            }
        }

        // If the second smallest element is still -1, it means all elements in the array are the same
        if(s2 == -1){
            // Return {-1, -1} indicating no second smallest element found
            return new long[]{-1, -1};
        }
        
        // Return an array containing the smallest and second smallest elements
        return new long[]{s, s2};
    }
}
