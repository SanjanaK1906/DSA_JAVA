package data_structure.Recursion_Assign;
//WAP to calculate factorial of a number.
public class Factorial {
	public long findfact(int num) {
		if(num==0 && num<1) {
			return 1;
		}else {
			return num * findfact(--num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f1= new Factorial();
		long num1= f1.findfact(3);
		long num2= f1.findfact(7);
		System.out.println("factorial of 3 is :- "+num1);  //6
		System.out.println("factorial of 7 is :- "+num2);  //5040
	}

}
