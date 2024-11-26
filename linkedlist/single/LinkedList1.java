package data_structure.linkedlist.single;
import java.util.*;
public class LinkedList1 {
	Node head;
	int count;
	//default constructor
	public LinkedList1() {
		head= null;
		count = 0;
	}
	public int sizeoflist() {
		return count;
	}
	//create linklist or insertion at end
	public void createlist(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
		System.out.println("enter value");  //take input from user
		int value= sc.nextInt();
		Node newnode = new Node(value);  //created new node
		//check condition for first node if head= null then add add new node address in head
		if(head == null) {
			head = newnode;
			count++;
		}else {
			Node r = head; //created reference
			while(r.next!=null) {  //traverse linked list to find last node
				r= r.next;
			}
			r.next= newnode; //append new node to existing list
			count++;
		}
		
		}
//		sc.close();
	}
	
	public void display() {
		Node t = head; //created reference t which traverse list from head
		while(t!=null) {
			System.out.print(t.data+"->");
			t=t.next;
		}
		System.out.println("----------------");
		
	}
	public void insertlast(int value) {
		Node newNode = new Node(value); //create new node
		Node r=head; //create reference
		if(head==null) { //check for empty list
			head=newNode;
			count++;
		}else { //if list having nodes
			while(r.next!=null) {
				r=r.next;
			}
			r.next=newNode;
			count++;
		}
		
	}
	public void insertstart(int value) {
		Node newNode = new Node(value); //create new node
		newNode.next=head;
		head=newNode;
		count++;
	}
	public void insertmiddle(int pos, int value ) {
		if(pos>count || count<2) {
			System.out.println("Insertion not possible");
		}else {
			Node newNode = new Node(value); //create new node
			Node r=head; //create reference
			for(int i =0; i<pos;i++) {
				r= r.next;
			}
			newNode.next=r.next;
			r.next=newNode;
			count++;
		}
	}
	
	public void deletestart() {
		if(head==null) { //empty list condition 
			System.out.println("no elements in list");
		}else {
			//list have only one node -> 2 ways solution
			//1st way by no reference more efficient in terms of memory
			if(head.next==null) {
				head=null;
			}
			//2nd way - by reference
//			Node r= head;
//			if(r.next ==null) {
//				head=null;
//			}
			else {
				head=head.next;
				//2nd way
//				head=r.next;
			}
			count--;
		}
	}
	
	public void deleteend() {
		if(head==null) { //empty list condition 
			System.out.println("no elements in list");
		}else {
			//list have only one node -> 2 ways solution
			//1st way by no reference more efficient in terms of memory
			if(head.next==null) {
				head=null;
			}else {
				Node r= head;
				while(r.next.next!=null) {
					r=r.next;
				}
				r.next=null;
				//2 reference
//				Node t= null;
//				while(r.next!=null) {
//					t=r;
//					r=r.next;
//				}
//				t.next=null;	
			}
			count--;
		}
	}
	
	public void deletemidddle(int pos) {
		if(pos>=count) {
			System.out.println("Invalid position");
		}else {
			Node r=head;
			//single reference
//			for(int i=1; i<pos-1;i++) {
//				r=r.next;
//			}
//			r.next=r.next.next;
//			count--;
			
			//2 reference method
			Node t=null;
			for(int i=1;i<pos;i++) {
				t=r;
				r=r.next;
			}
			t.next=r.next;
			count--;
		}
	}
	
	public void searchlist(int value) {
		if(head==null) {
			System.out.println("empty list");
		}else {
			Node r=head;
			boolean flag=false;
			int pos=1;
			while(r!=null) {
				if(r.data==value) {
					flag=true;
					System.out.println(value+"value found at position "+pos);
					break;
				}
				pos++;
				r=r.next;
			}
			if(!flag) {
				System.out.println("value not found");
			}
		}
	}
	public void reverse() {
		if(head==null) {
			System.out.println("empty list");
		}else {
			Node temp=head;//for reversing (next)
			Node prev=null;
			Node curr=null;
			while(temp!=null) {
				prev=curr;
				curr=temp;
				temp=temp.next;
				curr.next=prev;
			}
			head=curr;
		}
	}
	public void concatenate(LinkedList1 list2) {
	    if (this.head == null) { 
	        // If the first list is empty, simply make head of the first list point to the second list's head
	        this.head = list2.head;
	    } else {
	        // Traverse the first list to find the last node
	        Node current = this.head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        // Append the second list to the end of the first list
	        current.next = list2.head;
	    }
	    this.count += list2.count; // Update the count of the merged list
	}
	public void insertSorted(int value) {
	    Node newNode = new Node(value); // Create a new node
	    // If the list is empty or the new node should be inserted before the head
	    if (head == null || head.data >= value) {
	        newNode.next = head;
	        head = newNode;
	    } else {
	        Node current = head;
	        // Traverse the list to find the insertion point
	        while (current.next != null && current.next.data < value) {
	            current = current.next;
	        }
	        // Insert the new node after the current node
	        newNode.next = current.next;
	        current.next = newNode;
	    }
	    count++; // Increase the count of nodes
	}
	public void deleteNodev(int value) {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }

	    // If the node to be deleted is the head
	    if (head.data == value) {
	        head = head.next;
	        count--;
	        return;
	    }

	    Node current = head;
	    // Traverse the list to find the node with the given value
	    while (current.next != null) {
	        if (current.next.data == value) {
	            current.next = current.next.next;  // Delete the node
	            count--;
	            return;
	        }
	        current = current.next;
	    }
	    // If the value was not found
	    System.out.println("Node with value " + value + " not found.");
	}


}
