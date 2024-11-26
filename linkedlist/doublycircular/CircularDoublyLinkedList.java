package data_structure.linkedlist.doublycircular;

public class CircularDoublyLinkedList<e> {
    Dnode<e> head;
    Dnode<e> last;
    int count;

    public CircularDoublyLinkedList() {
        head = null;
        last = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Dnode<e> r = head;
            do {
                if (r.next == head) {
                    System.out.print(r.data + "\n");
                } else {
                    System.out.print(r.data + " <-> ");
                }
                r = r.next;
            } while (r != head);
        }
    }

    public void insertLast(e value) {
        Dnode<e> newnode = new Dnode<>(value);
        if (head == null) {
            head = last = newnode;
            head.next = head.prev = head;
        } else {
            newnode.prev = last;
            newnode.next = head;
            last.next = newnode;
            head.prev = newnode;
            last = newnode;
        }
        count++;
    }

    public void insertStart(e value) {
        Dnode<e> newnode = new Dnode<>(value);
        if (head == null) {
            head = last = newnode;
            head.next = head.prev = head;
        } else {
            newnode.next = head;
            newnode.prev = last;
            head.prev = newnode;
            last.next = newnode;
            head = newnode;
        }
        count++;
    }

    public void insertBetween(int pos, e value) {
        if (pos > count || count < 2) {
            System.out.println("Insertion not possible");
        } else {
            Dnode<e> newnode = new Dnode<>(value);
            Dnode<e> r = head;
            for (int i = 1; i < pos - 1; i++) {
                r = r.next;
            }
            newnode.next = r.next;
            newnode.prev = r;
            r.next.prev = newnode;
            r.next = newnode;
            count++;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty list");
        } else if (head == last) {
            head = last = null;
        } else {
            last = last.prev;
            last.next = head;
            head.prev = last;
        }
        count--;
    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("Empty list");
        } else if (head == last) {
            head = last = null;
        } else {
            head = head.next;
            head.prev = last;
            last.next = head;
        }
        count--;
    }

    public void deleteMiddle(int pos) {
        if (pos > count) {
            System.out.println("Invalid operation");
        } else {
            Dnode<e> r = head;
            for (int i = 1; i < pos; i++) {
                r = r.next;
            }
            r.prev.next = r.next;
            r.next.prev = r.prev;
            count--;
        }
    }
}
