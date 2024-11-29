package data_structure.Recursion_Assign;
//armstrong number -> eg. 153 = 1^3+5^3+3^3 = 1+125+27 = 153
///WAP to check whether the number is Armstrong or not.
public class ArmstrongNumber {
	//find digits count
	public int findcount(int num) {
		return String.valueOf(Math.abs(num)).length();
	}
	
	//function -for calculations of armstrong number
	public int findarmstrong1(int num, int count, int sum) {
		if(num ==0) {
			return sum;
		}else{
			int temp = num%10;
			sum= (int)(sum+Math.pow(temp, count));
			return findarmstrong1(num/10,count,sum);
		}
	}
	
	//check Armstrong number and display output
	public void checkarmstrongnum(int num) {
		int count =  findcount(num);
		int res = findarmstrong1(num,count,0);
		if (num == res) {
			System.out.println("This is armstrong number:- "+num);
		}else {
			System.out.println("This is not armstrong number:- "+num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber  a1 = new ArmstrongNumber();
		a1.checkarmstrongnum(153);
		a1.checkarmstrongnum(370);
		a1.checkarmstrongnum(371);
		a1.checkarmstrongnum(407);
		a1.checkarmstrongnum(90);
	}
}

	
	
