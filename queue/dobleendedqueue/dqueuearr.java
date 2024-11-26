package data_structure.queue.dobleendedqueue;


public class dqueuearr {
	int front;//1st inserted element index
	int rear;//last inserted element index
	int max;
	int arr[];
	dqueuearr(){
		front=rear=-1;
		max=10;
		arr=new int[max];
	}
	dqueuearr(int n){
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
		if(rear==max-1 && front==0) {
			return true;
		}else {
			return false;
		}
	}
	void enqueuebeg(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			if(front==0) { //case 1 - loop shifting front at 0 position and we have space at end so move elements so that we get space at front
				for(int i=rear;i>=front;i--) {
					arr[i+1]=arr[i];
				}
				rear++;
			}else{
				if(isEmpty()) {//case2 -empty
					front=rear=0;
				}else { //case3
					front--;
				}
				
			}
		}
			arr[front]=val;
	}
	void enqueueend(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			if(rear==max-1) { //case 1 - loop shifting rear at end and we have space at front spaces
				for(int i=front;i<=rear;i++) {
					arr[i-1]=arr[i];
				}
			}else { //case 3 - normal insertion
				rear++;
			}
			arr[rear]=val;
			if(isEmpty()) {//case2 -empty single insertion
				front=0;
			}else {
				
			}
		}
	}
//	int peak_rear() {
//		int data=0;
//		if(isEmpty()) {
//			System.out.println("queue is Empty");
//		}else {
//			data=arr[front];
//		}
//		return data;
//	}
	void dequeuefront() {
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
	void dequeuelast() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			arr[rear]=0;
			if(rear==front) { //single element
				front=rear=-1;
			}else { //delete from end 
				rear--;
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
		System.out.println("---double ended queue ---");
		dqueuearr q1= new dqueuearr();  //IRQ- input from one end front, output from both
		q1.enqueuebeg(10);
		q1.enqueuebeg(20);
		q1.enqueuebeg(30);
		q1.enqueuebeg(40);
		System.out.println("enqueue  beg is- ");
		q1.display();
		System.out.println("dequeue front- ");
		q1.dequeuefront();
		q1.display();
		System.out.println("dequeue end - ");
		q1.dequeuelast();
		q1.display();
		System.out.println("----------------------------------");
		dqueuearr q2= new dqueuearr();  //ORQ- output from one(front) end input from both
		q2.enqueuebeg(10);
		q2.enqueuebeg(20);
		q2.enqueuebeg(30);
		q2.enqueuebeg(40);
		System.out.println("enqueue beg is- ");
		q2.display();
		q2.enqueueend(100);
		q2.enqueueend(90);
		q2.enqueueend(80);
		q2.enqueueend(70);
		System.out.println("enqueue end is- ");
		q2.display();
		System.out.println("dequeue front - ");
		q2.dequeuefront();
		q2.display();
	}

}
