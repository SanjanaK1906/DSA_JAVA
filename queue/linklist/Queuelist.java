package data_structure.queue.linklist;

import data_structure.queue.array.Queuearray;

public class Queuelist {
	Node front;//1st inserted element index
	Node rear;//last inserted element index
	int count;
	Queuelist(){
		front=rear=null;
		count=0;
	}
	boolean isEmpty() {
		if(front==null) {
			return true;
		}else {
			return false;
		}
	}
	void enqueue(int val) {
		Node newnode=null;
		newnode= new Node(val);
		if(newnode==null) {
			System.out.println("queue is full");
		}else {
			if(isEmpty()) {
				front=rear=newnode;
			}else {
				rear.next=newnode;
				rear=newnode;
			}
			count++;
		}
	}
	int peak_rear() {
		
		int data=0;
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			data=front.data;
		}
		
		return data;
	}
	void dequeue() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			if(front==rear) {
				front=rear=null;
			}else {
				front=front.next;
			}
			count--;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			Node r=front;
			while(r!=null) {
				if(r.next==null) {
					System.out.println(r.data+" ");
				}else {
					System.out.print(r.data+"<->");
				}
				r=r.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuelist q1= new Queuelist();
		q1.enqueue(10);
		q1.enqueue(40);
		q1.enqueue(30);
		q1.enqueue(6);
		System.out.println("queue is- ");
		q1.display();
		System.out.println("dequeue- ");
		q1.dequeue();
		q1.display();
		System.out.println("peak_rear element is - ");
		System.out.println(q1.peak_rear());
	}

}
