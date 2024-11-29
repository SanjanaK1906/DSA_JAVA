package data_structure.Recursion_Assign;
//.     WAP to print reverse of a number.
public class Reverse {
	int rev=0;
	public void reverse(int num) {
		if(num!=0){
			int temp= num%10;
			rev=rev*10+temp;
			reverse(num/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r1 = new Reverse();
		r1.reverse(2345);
		System.out.println(r1.rev);
	}
}
