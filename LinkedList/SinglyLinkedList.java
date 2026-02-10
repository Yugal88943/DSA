public class SinglyLinkedList {
    // Node class
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    // Insert at end
    public void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;    
            return;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at beginning
    public void insertBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete by value
    public void delete(int key){
        if (head == null) 
            return;
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    // Traverse
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        System.out.println("---Insert End---");
        list.display();
        list.insertBeginning(1);
        list.insertBeginning(2);
        list.insertBeginning(3);
        list.insertBeginning(4);
        list.insertBeginning(5);
        System.out.println("---Insert Beginning---");
        list.display();

        list.delete(30);
        System.out.println("---Delete 30---");
        list.display();
    }


}
