import java.util.Arrays;

class Solution {
    
    // Function to check if two arrays A and B of size N are equal.
    public static boolean check(long A[], long B[], int N) {
        
        // Sort both arrays A and B.
        Arrays.sort(A);
        Arrays.sort(B);

        // Loop through each element in the sorted arrays.
        for (int i = 0; i < N; i++) {
            // If corresponding elements in A and B are not equal, return false.
            if (A[i] != B[i]) {
                return false;
            }
        }

        // If all elements are equal, return true.
        return true;
    }
}
