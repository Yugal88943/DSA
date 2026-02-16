// Loop detection in Linked List (Floyd's Algorithm)
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }    
}

public class LinkedListLoopDetection{
    public static boolean hasLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Loop Detected
            }
        }
        return false; // No Loop
    }

    //Driver Code
    public static void main(String[] args) {
        // Creating Linked List: 1->2->3->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating a loop: 4->2
        head.next.next.next.next = head.next;
        if (hasLoop(head)) 
            System.out.println("Loop Detected in Linked List");
        else
            System.out.println("No Loop in Linked List");
    }
}