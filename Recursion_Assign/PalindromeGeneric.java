package data_structure.Recursion_Assign;

public class PalindromeGeneric {
	public static <T> String reverse(T val) {
		String s= val.toString(); // Convert to string
		StringBuilder rev= new StringBuilder(s).reverse(); // Reverse the string
		return rev.toString(); // Return the reversed string
	}
	
	// Generic method to check if value is a palindrome
	public static<T> void checkpalindrome(T val) {
		String newval = val.toString();  // Convert the value to string
		String rev=reverse(val);  // Reverse the string
		
		// Check if original string and reversed string are the same
		if(newval.equals(rev)) {
			System.out.println(newval+" is palindrame");
		}else {
			System.out.println(newval+" is not palindrame");
		}
	}
	public static void main(String[] args) {
		checkpalindrome(151);
		checkpalindrome(1512);
		checkpalindrome("sanjana");
		checkpalindrome("madam");
	}

}
