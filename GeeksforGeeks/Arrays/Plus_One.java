// Plus one ---> Easy problem

class Solution {
    // Method to increment a number represented as an ArrayList of digits
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // Traverse the list from right to left
        for (int i = N - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the list
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1); // Increment the digit
                return arr; // Return the updated list
            }
            // If the current digit is 9, set it to 0
            arr.set(i, 0);
        }
        
        // If we have exited the loop, it means all digits were 9
        // We need to add a 1 at the beginning
        
        // Create a new ArrayList to store the incremented number
        ArrayList<Integer> newNumber = new ArrayList<>();
        newNumber.add(1); // Add 1 at the beginning of the new number
        newNumber.addAll(arr); // Add all digits from the original number after the leading 1
        
        return newNumber; // Return the incremented number
    }
};
