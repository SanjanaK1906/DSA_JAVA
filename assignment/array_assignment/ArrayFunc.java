
package data_structure.assignment.array_assignment;

import java.util.Scanner;

// Implement array as class and write following function in the that class
public class ArrayFunc {
	int max;
	int arr[];
	int count;// number of inserted element
	ArrayFunc(){
		max=10;
		arr=new int[max];
		count=0;
	}
	ArrayFunc(int n){
		max=n;
		arr=new int[max];
		count=0;
	}
	boolean isfull() {
		if(count==max) {
			return true;
		}else {
			return false;
		}
	}
	boolean isempty() {
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}
	//1.	Create Add
void create(int n) {
		
		Scanner sc= new Scanner(System.in);
		if(n+count>=max) {
			update();
		}
			System.out.println("Enter values");
			for(int i=count;i<count+n;i++) {
				arr[i]=sc.nextInt();
			}
			count=count+n;
		
	}
	private void update() {
		// TODO Auto-generated method stub
		max=max*2;  //increase capacity of array
		int []arr1=new int[max];//create arr1 as new array
		//shift elements of old array into new arr1
		for(int i=0;i<count;i++) {
			arr1[i]=arr[i];
		}
		arr=arr1;//change reference if arr
	}
	
//	2.	Traverse
	void display() {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			System.out.print("[ ");
			for(int i=0;i<count;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ]");
		}
	}
//	3.	Search
	void search(int val) {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			boolean flag=false;
			for(int i=0;i<count;i++) {
				if(arr[i]== val) {
					System.out.println("value found at index "+i);
					flag=true;
				}
			}
			if(!flag) {
				System.out.println("value not found");
			}
		}
	}
//	4.	Sort
	void sortarr() {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			for(int i=0;i<count;i++) {
				for(int j=0;j<count;j++) {
					if(arr[i]<arr[j]) {
						int n=arr[j];
						arr[j]=arr[i];
						arr[i]=n;
					}
				}
			}
		}
	}
//	5.	Insert at position
	void arrayinsertatpos(int val, int pos) {
		if(isfull()) {
			System.out.println("array is full");
		}else {
			if(pos<max && pos>=0) {
				if(pos<=count){
					for(int i=count;i>=pos;i--) {  //insert in array where value is present need to move elements
						arr[i+1]=arr[i];
					}
					arr[pos]=val;
				}
				count++;
			}
		}
	}
//	6.	Remove
	void delete() {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			arr[count-1]=0;
			count--;
		}
	}
//	7.	Delete at position
	void deleteatpos(int pos) {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			if(pos<count) {
				arr[pos]=0;
				for(int i=pos;i<count;i++) {
					arr[i]=arr[i+1];
				}
				count--;
			}else {
				System.out.println("Try again");
			}
			
		}
	}
//	8.	Reverse using single array without using 3rd variable
	void reverse() {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			int k=count;
			if(k%2==0) {
				for(int i=0;i<=k/2;i++,k--) {
					arr[k-1]=arr[i]+arr[k-1];
					arr[i]=arr[k-1]-arr[i];
					arr[k-1]=arr[k-1]-arr[i];
				}
			}else {
				for(int i=0;i<k/2;i++,k--) {
					arr[k-1]=arr[i]+arr[k-1];
					arr[i]=arr[k-1]-arr[i];
					arr[k-1]=arr[k-1]-arr[i];
				}
			}
			
		}
	}
//	9.	Concatenate
	void concatenate(int val) {
		if(isfull()) {
			System.out.println("array is full");
		}else {
			arr[count]=val;
			count++;
		}
	}
//	10.	Sum and average
	void sumavg() {
		if(isempty()) {
			System.out.println("array is empty");
		}else {
			double sum=0;
			double avg=0;
			for(int i=0;i<count;i++) {
				sum+=arr[i];
			}
			avg=sum/count;
			System.out.println("sum of all array elements is"+sum +" and avgerage is "+avg);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayFunc a1= new ArrayFunc();
		a1.create(6);
		System.out.println("values added in array");
		a1.display();
		System.out.println("value 8 search in array");
		a1.search(8);
		System.out.println("value 96 search in array");
		a1.search(96);
		System.out.println("sort array");
		a1.sortarr();
		a1.display();
		System.out.println("value 67 added  in array at index 4");
		a1.arrayinsertatpos(67,4);
		a1.display();
		System.out.println("value deleted in array");
		a1.delete();
		a1.display();
		System.out.println("value deleted in array at index 2");
		a1.deleteatpos(2);
		a1.display();
		System.out.println("array reverse- ");
		a1.reverse();
		a1.display();
		System.out.println("array concatenation- ");
		a1.concatenate(38);
		a1.display();
		a1.sumavg();
		
	}

}
