package data_structure.Problem1Lab;

import java.util.Scanner;

import data_structure.linkedlist.single.Node;

public class Dictionary {
	Node1 head;
	int ncount;
	public Dictionary() {
		head=null;
		ncount=0;
	}
	public int listsize() {
		return ncount;
	}
	public void createDict(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Node1 newnode = new Node1();  //created new node
			//check condition for first node if head= null then add add new node address in head
			if(head == null) {
				head = newnode;
				ncount++;
			}else {
				Node1 r = head; //created reference
				while(r.next!=null) {  //traverse linked list to find last node
					r= r.next;
				}
				r.next= newnode; //append new node to existing list
				ncount++;
			}
		}
		}
	
	public void insertlastDict(String w) {
		Node1 newNode = new Node1(w); //create new node
		Node1 r=head; //create reference
		if(head==null) { //check for empty list
			head=newNode;
			ncount++;
		}else { //if list having nodes
			while(r.next!=null) {
				r=r.next;
			}
			r.next=newNode;
			ncount++;
		}
	}
	public void displayDict() {
		Node1 t = head; //created reference t which traverse list from head
		while(t!=null) {
			t.data.display();
			t=t.next;
		}
		System.out.println("-----------------------");
		
	}
	public void searchDictionary(String value) {
		if(head==null) {
			System.out.println("empty list");
		}else {
			Node1 r=head;
			boolean flag=false;
			int pos=1;
			while(r!=null) {
				if((r.data.word).equals(value)) {
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
}
