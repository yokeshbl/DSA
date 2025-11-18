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

    // Method to remove Nth node from end
    public Node removeNthFromEnd(Node head, int n) {
        // write your code here
        return null;
    }

    // Method to display the list
    public void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = obj.new Node(1);
        head.next = obj.new Node(2);
        head.next.next = obj.new Node(3);
        head.next.next.next = obj.new Node(4);
        head.next.next.next.next = obj.new Node(5);

        int n = 2; // remove 2nd node from end
        head = obj.removeNthFromEnd(head, n);

        System.out.print("Updated Linked List: ");
        obj.display(head);
    }
}
