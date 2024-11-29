package data_structure.Recursion_Assign;

public class reversenum {
	
	public static int reverse(int num, int rev) {
		if(num!=0) {
			int temp= num%10;
			rev= rev*10+temp;
			return reverse(num/10, rev);
		}else {
			return rev;
		}
	}
	public static void main(String[] args) {
		//  add 0 as default second argument to consider default value of rev =0;
		int number =25789;
		System.out.println(reverse(number,0));
	}

}
