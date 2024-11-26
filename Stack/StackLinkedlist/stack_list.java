package data_structure.Stack.StackLinkedlist;

public class stack_list {
	Node top;
	int count;
	
	public stack_list(){
		top=null;
		count=0;
	}
	boolean isEmpty() {
		if(top==null) {
			return true;
		}else {
			return false;
		}
	}
	void push(int val) {
		Node newnode = null;
		newnode = new Node(val);
		if(newnode==null) {
			System.out.println("stack is full");
		}else {
			if(isEmpty()) {
				top=newnode;
			}else {
				newnode.next=top;
				top=newnode;
			}
			count++;
		}
	}
	int peak() {
		int data=0;
		if(isEmpty()) {
			System.out.println("stack empty");
		}else {
			data=top.data;
		}
		return data;
	}
	void pop() {
		if(isEmpty()) {
			System.out.println("stack empty");
		}else {
			if(top.next==null) {
				top=null;
			}else {
				top=top.next;
			}
			count--;
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("stack empty");
		}else {
			Node r =top;
			while(r!=null)
			{
			if(r.next==null) {
				System.out.print(r.data+" ");
			}else {
				System.out.print(r.data+"<->");
			}
			r=r.next;
			}
		}
	}

}
