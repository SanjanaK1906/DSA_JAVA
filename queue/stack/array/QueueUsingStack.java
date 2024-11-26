package data_structure.queue.stack.array;
import data_structure.Stack.StackArray.Stackarray;
public class QueueUsingStack {
	 Stackarray s1; // stack for enqueue
	    Stackarray s2; // stack for dequeue

	    // Default constructor
	    public QueueUsingStack() {
	        s1 = new Stackarray(); //max=10; top=-1;arr=new int[max];
	        s2 = new Stackarray();
	    }

	    // Parameterized constructor
	    public QueueUsingStack(int size) {
	        s1 = new Stackarray(size);//max=size; top=-1;arr=new int[max];
	        s2 = new Stackarray(size);
	    }

	    // Enqueue operation
	    void enqueue(int value) {
	        if (s1.isFull()) {
	            System.out.println("Queue is Full!!");
	        } else {
	            s1.push(value);
	            System.out.println("Enqueued: " + value);
	        }
	    }

	    // Dequeue operation
	    void dequeue() {
	        if (s1.isEmpty() && s2.isEmpty()) {
	            System.out.println("Queue is Empty!!");
	        } else {
	            // Transfer all elements from s1 to s2 if s2 is empty
	            if (s2.isEmpty()) {
	                while (!s1.isEmpty()) {
	                    s2.push(s1.peak());
	                    s1.pop();
	                }
	            }
	            // Pop the top of s2 (front of the queue)
	            s2.pop();
	        }
	    }

	    // Peek operation (front of the queue)
	    int peek() {
	        if (s1.isEmpty() && s2.isEmpty()) {
	            System.out.println("Queue is Empty!!");
	            return -1;
	        } else {
	            if (s2.isEmpty()) {
	                while (!s1.isEmpty()) {
	                    s2.push(s1.peak());
	                    s1.pop();
	                }
	            }
	            return s2.peak();
	        }
	    }

	    // Display elements of the queue
	    void display() {
	        if (s1.isEmpty() && s2.isEmpty()) {
	            System.out.println("Queue is Empty!!");
	        } else {
	            System.out.println("Queue elements are:");
	            // Display elements in s2 (reversed order)
	            for (int i = s2.top; i >= 0; i--) {
	                System.out.print(s2.arr[i] + " ");
	            }
	            // Display elements in s1 (normal order)
	            for (int i = 0; i <= s1.top; i++) {
	                System.out.print(s1.arr[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        QueueUsingStack queue = new QueueUsingStack(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.display();

	        queue.dequeue();
	        queue.display();

	        System.out.println("Front element: " + queue.peek());

	        queue.enqueue(40);
	        queue.enqueue(50);
	        queue.enqueue(60); // Should show "Queue is Full!!"
	        queue.display();
	    }
}
