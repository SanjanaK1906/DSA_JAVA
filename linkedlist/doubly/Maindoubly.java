package data_structure.linkedlist.doubly;

public class Maindoubly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doublylinklist<Integer> d1= new Doublylinklist<Integer>();
		d1.insertlast(10);
		d1.insertlast(20);
		d1.insertlast(30);
		d1.insertstart(9);
		d1.insertstart(8);
		d1.display();
		d1.insertstart(7);
		System.out.println("insertstart");
		d1.display();
		d1.insertlast(40);
		System.out.println("insertlast");
		d1.display();
		d1.insertbetween(3, 67);
		System.out.println("insertbetween pos 3 val 67");
		d1.display();
		d1.deletestart();
		System.out.println("deletestart");
		d1.display();
		d1.deletemiddle(3);
		System.out.println("deletemiddle after pos 3");
		d1.display();
		d1.deletelast();
		System.out.println("deletelast");
		d1.display();
	}

}
