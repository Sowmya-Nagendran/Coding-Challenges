class Reverse {
    // This method takes a string as input and returns the reversed string
    public static String reverseWord(String str) {
        // Create a new StringBuilder object initialized with the input string
        // Use the reverse() method of StringBuilder to reverse the string
        // Convert the reversed StringBuilder object back to a String
        String rev = new StringBuilder(str).reverse().toString();
        // Return the reversed string
        return rev;
    }
}
