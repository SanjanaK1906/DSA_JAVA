package data_structure.Searching;
//Binary search
//time complexity- 
//best case - O(1)      worstcase- O(log n)     avgcase -O(log n)
public class BinarySearch {
	public void bsearch(int[]num,int searchval) {
		int low=0;
		int high=num.length-1;
		int mid= (low+high)/2;
		while (low<=high &&num[mid]!=searchval) {
			if (num[mid]<searchval) {
				low=mid+1;
			}else {
				high =mid-1;
			}
			mid=(low+high)/2;
		}
		if(low>mid) {
			System.out.println("value not found");
		}else {
			System.out.println("value "+searchval+" found at index "+mid);
		}
	}
	
	
	public static void main(String[] args) {
		// Binary Search needs sorted array
		BinarySearch l1= new BinarySearch();
		int [] num;
		num= new int[]{1,4,5,6,8,34,67,69,90,87};
		l1.bsearch(num, 90); //8
		l1.bsearch(num, 5); //2
		l1.bsearch(num, 7); //not found
	}
}
