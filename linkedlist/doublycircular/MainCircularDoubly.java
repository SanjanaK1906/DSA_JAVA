package data_structure.linkedlist.doublycircular;
public class MainCircularDoubly {

    public static void main(String[] args) {
        CircularDoublyLinkedList<Integer> cdll = new CircularDoublyLinkedList<>();
        cdll.insertLast(10);
        cdll.insertLast(20);
        cdll.insertLast(30);
        cdll.insertStart(9);
        cdll.insertStart(8);
        cdll.display();
        cdll.insertStart(7);
        System.out.println("After insertStart:");
        cdll.display();
        cdll.insertLast(40);
        System.out.println("After insertLast:");
        cdll.display();
        cdll.insertBetween(3, 67);
        System.out.println("After insertBetween (pos 3and value 67):");
        cdll.display();
        cdll.deleteStart();
        System.out.println("After deleteStart:");
        cdll.display();
        cdll.deleteMiddle(3);
        System.out.println("After deleteMiddle (pos 3):");
        cdll.display();
        cdll.deleteLast();
        System.out.println("After deleteLast:");
        cdll.display();
    }
}
