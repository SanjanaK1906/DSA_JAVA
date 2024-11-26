package data_structure.queue.circularQueue;

public class Circularqueuearr {
	int front;//1st inserted element index
	int rear;//last inserted element index
	int max;
	int arr[];
	Circularqueuearr(){
		front=rear=-1;
		max=10;
		arr=new int[max];
	}
	Circularqueuearr(int n){
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
//		if(front==0&&rear==max-1||front==rear+1) {
		if(rear+1%max==front) {
			return true;
		}else {
			return false;
		}
	}
	void enqueue(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			if(rear==max-1) { // full 
				rear=0;
			}else {
				rear++;
			}
			arr[rear]=val;
			if(isEmpty()) { //single data
				front=0;
			}
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
			if(rear==front) {//single data
				front=rear=-1;
			}else if(front==max-1){//front on max-1 node(last node to make it circular we need to move it on 0 index again
				front=0;
			}else {
				front++;
			}
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			if(front<rear) {
				for(int i=front;i<=rear;i++) {
					System.out.println(arr[i]+" ");
				}
			}else {
				for(int i=0;i<=rear;i++) {
					System.out.println(arr[i]+" ");
				}
				for(int i=front;i<=max-1;i++) {
					System.out.println(arr[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---circular  queue  with array---");
		Circularqueuearr q1= new Circularqueuearr();
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