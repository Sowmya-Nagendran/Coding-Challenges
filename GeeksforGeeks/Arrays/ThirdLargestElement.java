// Third largest element ---> Basic problem

class Solution {
    int thirdLargest(int a[], int n) {
        // Check if the array has less than 3 elements.
        // If it does, return -1 as there can't be a third largest element.
        if (n < 3) {
            return -1;
        }

        // Sort the array in ascending order.
        Arrays.sort(a);

        // Calculate the index of the third largest element.
        // Since the array is sorted in ascending order, the third largest element
        // will be at index (n - 3).
        int start = n - 3;

        // Return the third largest element.
        return a[start];
    }
}
