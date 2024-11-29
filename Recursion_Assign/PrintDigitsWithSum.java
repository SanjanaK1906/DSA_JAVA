package data_structure.Recursion_Assign;
//.     WAP to print all digits of a number and their sum.
public class PrintDigitsWithSum {
	int sum=0;
	int count=0;
	public void displaydigitswithsum(int num) {
		if(num!=0) {
			sum=sum+(num%10);
			count++;
			displaydigitswithsum(num/10);
		}
	}
	public static void main(String[] args) {
		PrintDigitsWithSum p1= new PrintDigitsWithSum();
			p1.displaydigitswithsum(9087);
			System.out.println("digit count of 9087 is "+p1.count);//4
			System.out.println("sum of digits of 9087 is "+p1.sum); //24
			PrintDigitsWithSum p2= new PrintDigitsWithSum();
			p2.displaydigitswithsum(785);
			System.out.println("digit count of 785 is "+p2.count); //2
			System.out.println("sum of digits of 785 is "+p2.sum);  //20
	}
}