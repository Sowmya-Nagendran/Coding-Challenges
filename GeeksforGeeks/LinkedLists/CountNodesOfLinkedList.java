/* Complete the function below */
/*
class Node {
    int data;
    Node next;
    Node(int a) { data = a; next = null; }
}
*/

class Solution {
    // Function to count nodes of a linked list.
    public static int getCount(Node head) {
        
        // Initialize a count variable to keep track of the number of nodes.
        int count = 0;
        
        // Initialize a temporary node variable to traverse the linked list starting from the head.
        Node temp = head;
        
        // Traverse the linked list until the end (i.e., until temp becomes null).
        while (temp != null) {
            // Increment the count for each node encountered.
            count++;
            
            // Move to the next node in the linked list.
            temp = temp.next;
        }
        
        // Return the total count of nodes in the linked list.
        return count;
    }
}
