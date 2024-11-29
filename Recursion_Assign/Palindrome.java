package data_structure.Recursion_Assign;

public class Palindrome {
	public static int reverse(int num, int rev) {
		if(num!=0) {
			int temp= num%10;
			rev= rev*10+temp;
			return reverse(num/10, rev);
		}else {
			return rev;
		}
	}
	public static void checkpalindrome(int num) {
		int rev=reverse(num,0);
		if(num== rev) {
			System.out.println("Number "+num+" is palindrame");
		}else {
			System.out.println("Number "+num+" is not palindrame");
		}
	}
	public static void main(String[] args) {
		checkpalindrome(151);
		checkpalindrome(1512);
	}
}
