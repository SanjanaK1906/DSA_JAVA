package data_structure.queue.circularQueue.circularqueueuusinglinklist;
import java.util.Scanner;

import data_structure.linkedlist.circular.cnode;
public class circularqueueusinglinklist {
	cnode head =null;
	cnode last=null;
	int count;
//	public void createclist(int n) {
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < n; i++) {
//			System.out.println("enter value");  //take input from user
//			int value= sc.nextInt();
//			cnode newnode= new cnode(value); //created new node
//			if(head==null) {
//				head=newnode;	
//			}else {
//				last.next=newnode;
//			}
//			last=newnode;
//			last.next=head;
//			count++;
//		}
//		sc.close();
//	}
	public void displaycqueue() {
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
	
	public void enqueue(int val) //insert at last
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
	
	public void dequeue() //delete from start
	{
		if(head==null) {
			System.out.println("empty list");
		}else {
			head=head.next;
			last.next=head;
		}
	}
	public static void main(String[] args) {
		System.out.println("---circular  queue  using linkedlist---");
		circularqueueusinglinklist s1 = new circularqueueusinglinklist();
		s1.enqueue(10);
		s1.enqueue(20);
		s1.enqueue(30);
		s1.enqueue(40);
		s1.enqueue(50);
		System.out.println("enqueued elements -");
		s1.displaycqueue();
		s1.dequeue();
		System.out.println(" \n dequeued elements -");
		s1.displaycqueue();
	}
	
}
