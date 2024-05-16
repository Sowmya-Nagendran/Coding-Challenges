// Last index of one ---> Basic problem

class Solution {
    
    // Method to find the last index of character '1' in the given string
    public int lastIndex(String s) {
        
        // Use the built-in method lastIndexOf to find the last occurrence of '1' in the string
        int index = s.lastIndexOf('1');
        
        // Return the index of the last occurrence of '1'
        return index;
    }
}
