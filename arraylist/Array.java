package data_structure.arraylist;

import java.util.Scanner;

public class Array {
	int capa; //capacity of array max no of elements can hold
	int count; // size of array
	int arr[];
	
	public Array() {
		capa=10;
		count=0;
		arr=new int[capa];
	}
	public Array(int n) {
		capa=n;
		count=0;
		arr=new int[capa];
	}
	int capacity() {
		return capa;
	}
	int count() {
		return count;
	}
	
	void create(int n) {
		
		Scanner sc= new Scanner(System.in);
		if(n+count>=capa) {
			update();
		}
			System.out.println("Enter values");
			for(int i=count;i<count+n;i++) {
				arr[i]=sc.nextInt();
			}
			count=count+n;
		
	}
	void display() {
		System.out.print("[ ");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	private void update() {
		// TODO Auto-generated method stub
		capa=capa*2;  //increase capacity of array
		int []arr1=new int[capa];//create arr1 as new array
		//shift elements of old array into new arr1
		for(int i=0;i<count;i++) {
			arr1[i]=arr[i];
		}
		arr=arr1;//change reference if arr
	}
	public void append(int n) {
		if(count==capa) {
			update();
		}
		arr[count]=n;
		count++;
	}
	public void insert(int val, int pos) {
		if(count==capa) {
			update();
		}
		for(int i=count;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=val;
		count++;
	}
	public void removelast() {
		if(count==0) {
			System.out.println("Empty array");
		}else {
			arr[count-1]=0;
			count--;
		}
	}
	public void removeatpos(int pos ) {
		if(count==0) {
			System.out.println("Empty array");
		}else {
			if(pos>count) {
				System.out.println("invalid pos");
			}else {
				for(int i=pos;i<count;i++) {
					arr[i]=arr[i+1];
					count--;
				}
			}
		}
	}
	public void search(int val) {
		if(count==0) {
			System.out.println("Empty array");
		}else {
			boolean flag=false;
			for(int i=0; i<count;i++) {
				if(arr[i]==val) {
					flag=true;
					System.out.println("element found at index "+i);
				}
			}
			if(!flag) {
				System.out.println("element not found");
			}
		}
	}

}
