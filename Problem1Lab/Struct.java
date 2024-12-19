package data_structure.Problem1Lab;

import java.util.Scanner;

public class Struct {
	public int count=0;
	public String word;
	public int meancount=5;
	public int len=20;
	char[][]arr=new char[meancount][len]; //5 words with max char len 20
//	public Struct() {
//		word="";
//		count++;
//	}
	Scanner sc= new Scanner(System.in);
	public Struct() {
		super();
		System.out.println("enter word");
		word=sc.next();
		addmeaning();
		
	}
	public Struct(String w) {
		super();
		word=w;
		addmeaning();
		
	}
	public void addmeaning() {
		System.out.println("do you wanna enter meaning of word ? if yes-y no-n");
//		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		if(a.equals("y")) {
			while(count<meancount) {
				System.out.println("Enter meaning " + (count + 1) + ":");
				String mean= sc.next();
					for(int j=0;j < mean.length() && j<len;j++) {
						arr[count][j]=mean.charAt(j);
					}
					count++;
					if(count<meancount) {
						System.out.println("do you want to continue? if yes-y no-n");
						String ans=sc.next();
						if (!ans.equals("y")) {
	                        break;
	                    }
					}
			}
		}else if(a.equals("n")) {
			System.out.println("Thanks!");
		}else {
			System.out.println("Try again !");
		}
	}
	public void display() {
		 System.out.println("Word: " + word);
	     System.out.println("Meanings:");
		for(int i=0;i<count;i++) {
			for(int j=0;j<len;j++) {
				if (arr[i][j] != '\u0000') { // Check for uninitialized cells
                    System.out.print(arr[i][j]);
                }
			}
			System.out.print (" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
//		Struct s1= new Struct();
//		s1.display();

	}

}
