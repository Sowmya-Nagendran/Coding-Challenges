import java.util.Arrays;

class Compute {
    // Function to check if array a2 is a subset of array a1
    public String isSubset(long a1[], long a2[], long n, long m) {
        // Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Initialize two pointers to traverse both arrays
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < n && j < m) {
            // If current element of a1 is less than current element of a2,
            // move to the next element in a1
            if (a1[i] < a2[j]) {
                i++;
            }
            // If current element of a1 is equal to current element of a2,
            // move to the next element in both arrays
            else if (a1[i] == a2[j]) {
                i++;
                j++;
            }
            // If current element of a1 is greater than current element of a2,
            // a2 cannot be a subset of a1, return "No"
            else {
                return "No";
            }
        }

        // If all elements of a2 were found in a1
        // i.e., j has reached the end of a2, return "Yes"
        if (j < m) {
            return "No";
        }

        // If all elements of a2 are found in a1, return "Yes"
        return "Yes";
    }
}
