package data_structure.Stack.StackArray;

public class Stackarray {
	public int max;//max size of stack
	public int top; //last inserted element in stack
	public int arr[];
	// default constructor 
	public Stackarray() {
		max=10;
		top=-1;
		arr=new int[max];
	}
	// parameterized constructor 
	public Stackarray(int n) {
		max=n;
		top=-1;
		arr=new int[max];
	}
	//stack empty condition
	public boolean isEmpty(){
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	//stack full condition
	public boolean isFull(){
		if(top==max-1) {
			return true;
		}else {
			return false;
		}
	}
	
	//push(insert) values in stack
//	 _ _ _ _ _
//	|_|_|_|_|_|
//	 0 1 2 3 4    
//	here top=-1  and max =4
//	empty array=> top=-1 & full array top=max-1
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full !!");
		}else {
			top++;
			arr[top]=value;
			//or 
//			arr[++top]=value;
		}
	}
//	pop- remove topmost element from stack
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !!");
		}else {
			arr[top]=0;
			top--;
			//or 
//			arr[top--]=0;
		}
	}
	
//	The peak operation in a stack refers to retrieving the top element of the stack without removing it. It allows you to "look" at the top value in the stack without altering the stack's state.


	public int peak() {
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is Empty !!");
		}else {
			data=arr[top];
		}
		return data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !!");
		}else {
			System.out.println("Stack elements are :- ");
//			 traverse from top to index 0
			for(int i=top;i>=0;i--) {
				System.out.println(arr[i]);
			}
//			 traverse from index 0 to top 
//			for(int i=0;i<max;i++) {
//				System.out.println(arr[i]);
//			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackarray s1 = new Stackarray();
		s1.push(11);
		s1.push(22);
		s1.push(33);
		s1.push(44);
		s1.display();
		System.out.println("Stack -POP 2 elements");
		s1.pop();
		s1.pop();
		s1.display();
		System.out.println("Stack -peak");
		System.out.println(s1.peak());
	}

}
