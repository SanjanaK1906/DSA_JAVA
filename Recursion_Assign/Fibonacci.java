package data_structure.Recursion_Assign;
//.     WAP to print the Fibonacci series in a given range.
public class Fibonacci {
	
	public void Fseries(int prev , int next , int limit) {
		if(prev<= limit) {
			System.out.print(prev+", ");
			int temp= next;
			next = prev+next;
			prev = temp;
			Fseries(prev,next,limit);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f1 = new Fibonacci();
		//pass 1, 1 as default values for prev and next pass 3rd parameter for limit
		f1.Fseries(1,1,20); //1, 1, 2, 3, 5, 8, 13, 
	}

}

//1,  1,  2,  3,  5,  8,  13, 
//p   n
//    p   n 
//        p   n
//            p   n
