package data_structure.sorting;

public class InsertionSort {

	int arr1[];
	static int len;
	public static void isort(int[]arr) {
		for(int i=0;i<len;i++) {
			int key= arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
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
		InsertionSort.displayarr(arr1);
		InsertionSort.isort(arr1);  //sorting algo method called
		System.out.println("array after sorting");
		InsertionSort.displayarr(arr1);
	}
	public static void main(String[] args) {
		InsertionSort s1 = new InsertionSort();
		int []arrnew= {1,23,78,5,9,90};
		s1.displaysortedarr(arrnew);
	}

}
