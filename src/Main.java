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

    // Method to detect cycle in linked list
    public boolean hasCycle(Node head) {
        if(head == null) return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main list = new Main();

        // Creating a linked list: 3 -> 2 -> 0 -> -4
        Node head = list.new Node(3);
        Node second = list.new Node(2);
        Node third = list.new Node(0);
        Node fourth = list.new Node(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        // creating a cycle (tail connects to second node)
        fourth.next = second;

        System.out.println("Cycle detected? " + list.hasCycle(head));
    }
}
