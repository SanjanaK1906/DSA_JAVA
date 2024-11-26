package data_structure.linkedlist.circular;
import java.util.Scanner;
public class circularllist {
	cnode head =null;
	cnode last=null;
	int count;
	public void createclist(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("enter value");  //take input from user
			int value= sc.nextInt();
			cnode newnode= new cnode(value); //created new node
			if(head==null) {
				head=newnode;	
//				last=newnode;
//				last.next=head;
			}else {
				last.next=newnode;
//				last=newnode;
//				last.next=head;
			}
			last=newnode;
			last.next=head;
			count++;
		}
		sc.close();
	}
	public void displayclist() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			cnode r=head;
			do {
				if(r.next==head) {
					System.out.print(r.data+" ");
				}else {
					System.out.print(r.data+"->");
				}
				r=r.next;
			}while(r!=head);
		}
	}
	public void insertstart(int val)
	{
		cnode newnode= new cnode(val);
		if(head==null) {
			head=newnode;
			last=newnode;
			last.next=head;
		}else {
			newnode.next=head;
			last.next = newnode; // Last node points to new head
	        head = newnode;
		}
		count++;
	}
	public void insertlast(int val)
	{
		cnode newnode= new cnode(val);
		if(head==null) {
			head=newnode;
		}else {
			last.next=newnode;
		}
			last=newnode;
			last.next=head;
		count++;
	}
	public void insertmiddle(int pos, int val) {
		cnode newnode= new cnode(val);
		if(head==null) {
			head=newnode;
			last=newnode;
			last.next=head;
		}else {
			cnode r=head;
			for(int i=1;i<pos-1;i++) {
				r=r.next;
			}
			newnode.next=r.next;
			r.next=newnode;
		}
		count++;
	}
	public void deletelast()
	{
		if(head==null) {
			System.out.println("empty list");
		}else {
			cnode r=head;
			while(r.next!=last) {
				r=r.next;
			}
			last=r;
			r.next=head;
		}
	}
	public void deletemiddle(int pos)
	{
		if(head==null) {
			System.out.println("empty list");
		}else {
			cnode r=head;
			for(int i=1;i<pos-1;i++) {
				r=r.next;
			}
			r.next=r.next.next;
		}
	}
	public void deletestart()
	{
		if(head==null) {
			System.out.println("empty list");
		}else {
			head=head.next;
			last.next=head;
		}
	}
	public void search(int val) {
		if(head==null) {
			System.out.println("empty list");
		}else {
			cnode r=head;
			int pos=1;
			boolean flag=false;
			do{
				if(r.data==val) {
					System.out.println(val+" found at position "+pos);
					flag=true;
				}
				r=r.next;
				pos++;
			}while(r!=head);
			if(!flag) {
				System.out.println("value not found");
			}
			
		}
	}
}
