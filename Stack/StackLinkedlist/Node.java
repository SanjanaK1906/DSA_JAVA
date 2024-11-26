package data_structure.Stack.StackLinkedlist;

public class Node {
	int data; //data field of linked list
	Node next; // reference field of link list
	//default constructor
	public Node() {
		data=0;
		next=null;
	}
	//parameterized constructor
	public Node(int d) {
		this.data = d;
		next = null;
	}

}
