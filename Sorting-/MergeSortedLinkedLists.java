package data_structure.sorting;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLinkedLists {

    // Function to merge two sorted linked lists
    public static Node mergeLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // Initialize a dummy node
        Node dummy = new Node(0);
        Node current = dummy;

        // Merge the two lists
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

    // Helper function to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // First sorted linked list: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Second sorted linked list: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        System.out.println("List 1:");
        printList(l1);
        System.out.println("List 2:");
        printList(l2);

        // Merge the two lists
        Node mergedList = mergeLists(l1, l2);
        System.out.println("Merged List:");
        printList(mergedList);
    }
}

