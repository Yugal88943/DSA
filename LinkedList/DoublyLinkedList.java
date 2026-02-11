// Doubly Linked List Program
public class DoublyLinkedList {
    // Node class
    class Node{
        int data;
        Node prev; // Previous 
        Node next; //Next Pointer
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at Position (1- Based Index)
    public void insertAtPosition(int data, int position){
        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        for(int i=1; temp != null && i<position-1; i++){
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from Beginning
    public void deleteFromBeginning(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Delete from End
    public void deleteFromEnd(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete from Position
    public void deleteFromPosition(int position){
        if (head == null || position <= 0) {
            System.out.println("Invalid Operation");
            return;
        }
        if(position == 1){
            deleteFromBeginning();
            return;
        }
        Node temp = head;
        for(int i =1; temp != null && i < position; i++){
            temp = temp.next;            
        }
        if (temp == null) {
            System.out.println("Position out of Range.");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Search
    public void search(int key){
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: "+ position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Element Not Found!");
    }

    // Display forward
    public void displayForward(){
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Display Backward
    public void displayBackward(){
        if (head == null) 
            return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }    
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(5);
        dll.insertAtBeginning(50);
        dll.insertAtBeginning(100);
        dll.insertAtEnd(20);
        dll.insertAtEnd(1000);
        dll.insertAtEnd(2000);
        dll.insertAtEnd(3000);
        dll.insertAtEnd(25);
        dll.insertAtPosition(15, 3);
        dll.insertAtPosition(500, 1);
        dll.displayForward();
        dll.displayBackward();
        dll.search(15);
        dll.deleteFromBeginning();
        dll.deleteFromEnd();
        dll.deleteFromPosition(2);
        dll.displayForward();
        dll.displayBackward();

    }
}
