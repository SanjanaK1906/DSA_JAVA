package data_structure.Stack.StackLinkedlist;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack_list s1= new stack_list();
		System.out.println("creating stack");
		s1.push(12);
		s1.push(23);
		s1.push(5);
		s1.push(56);
		s1.push(18);
		System.out.println("display stack");
		s1.display();
		System.out.println("pop stack");
		s1.pop();
		s1.display();
		System.out.println("peak stack");
		System.out.println(s1.peak());
	}

}
