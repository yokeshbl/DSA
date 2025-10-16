public class Main {

    // Node structure for LinkedList
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // head of the list

    // Method to add element to linked list
    public void add(int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    // Method to display linked list elements
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.add(10);
        list.add(20);
        list.add(35);
        list.add(55);
        System.out.print("Linked List: ");
        list.display();
    }
}
