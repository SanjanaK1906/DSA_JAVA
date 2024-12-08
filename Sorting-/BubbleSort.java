package data_structure.sorting;

public class BubbleSort {
	int arr1[];
	static int len;  //store length of array
	public static void bsort(int[]arr) {
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	public static void swap(int[]arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void displayarr(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void displaysortedarr(int[]arr) {
		arr1= arr;
		len= arr.length;
		System.out.println("array before sorting");
		BubbleSort.displayarr(arr1);
		BubbleSort.bsort(arr1);  //sorting algo method called
		System.out.println("array after sorting");
		BubbleSort.displayarr(arr1);
	}
	public static void main(String[] args) {
		BubbleSort s1 = new BubbleSort();
		int []arrnew= {1,23,78,5,9,90};
		s1.displaysortedarr(arrnew);
	}
}
