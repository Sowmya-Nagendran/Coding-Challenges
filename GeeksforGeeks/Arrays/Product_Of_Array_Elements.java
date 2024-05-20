// Product of array elements ---> Basic Problem

/*
    arr[] is the array containing the elements.
    n is the number of elements in the array.
    mod is the modulo value.
*/
class GfG {
    
    // Function to calculate the product of all elements in the array modulo `mod`.
    public static Long product(Long arr[], Long mod, int n) {
        
        // Initialize the product to 1. We start with 1 because multiplying by 1 does not change the result.
        long prod = 1;
        
        // Loop through all elements in the array.
        for(int i = 0; i < n; i++) {
            
            // Multiply the current product by the current element and take the modulo `mod`.
            // This ensures that the product does not overflow and remains within a manageable range.
            prod = (prod * arr[i]) % mod;
        }
        
        // Return the final product after processing all elements.
        return prod;
    }
}
