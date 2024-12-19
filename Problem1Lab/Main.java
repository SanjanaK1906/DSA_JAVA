package data_structure.Problem1Lab;

import java.util.Scanner;

public class Main {
	public static int option;
	
	public static void displayoption() {
		Scanner sc= new Scanner(System.in);
		System.out.println("menu :");
		System.out.println("enter 1 -Add a multiple words ");
		System.out.println("enter 2 -search for word");
		System.out.println("enter 3 -insert word");
		System.out.println("enter 4 -display dict");
		 option= sc.nextInt();
	}
	public static void main(String[] args) {
		Dictionary l1= new Dictionary();
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome !");
		Main.displayoption();
		
		String input;
		do {
			switch(option){
			case 1:
				System.out.println("How many words do you wanna add in dict ");
				int temp= sc.nextInt();
				l1.createDict(temp);
				break;
			case 2:
				System.out.println("Which word do you want to search ");
				String temp1= sc.next();
				l1.searchDictionary(temp1);
				break;
			case 3:
				System.out.println("Which word do you want to insert");
				String temp2= sc.next();
				l1.insertlastDict(temp2);
				break;
			case 4:
				System.out.println("Display Dictionary");
				l1.displayDict();
				break;
			default:
				System.out.println(" Thank You ");
			}
			System.out.println("Do you wanna continue ? yes / no");
			input=sc.next();
			if(input.equals("yes")) {
				Main.displayoption();
			}else {
				break;
			}
		}while(!input.equals("no"));
	}

}
