package data_structure.queue.array;

public class Queuearray {
	int front;//1st inserted element index
	int rear;//last inserted element index
	int max;
	int arr[];
	Queuearray(){
		front=rear=-1;
		max=10;
		arr=new int[max];
	}
	Queuearray(int n){
		front=rear=-1;
		max=n;
		arr=new int[max];
	}
	boolean isEmpty() {
		if(front==-1) {
			return true;
		}else {
			return false;
		}
	}
	boolean isFull() {
		if(rear==max-1) {
			return true;
		}else {
			return false;
		}
	}
	void enqueue(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			if(isEmpty()) {
				front=0;
			}
			rear++;
			arr[rear]=val;
		}
	}
	int peak_rear() {
		int data=0;
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			data=arr[front];
		}
		return data;
	}
	void dequeue() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			arr[front]=0;
			if(rear==front) {
				front=rear=-1;
			}else {
				front++;
			}
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuearray q1= new Queuearray();
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
