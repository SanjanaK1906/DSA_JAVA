package data_structure.sorting;

public  class SelectionSort {
	int arr1[];
	static int len;
	public static void ssort(int[]arr) {
		for(int i=0;i<len-1;i++) {
			int small=arr[i];
			int index=i;
			for(int j=i+1;j<len-1;j++) {
				if(arr[j]<small) {
					index=j;
					small=arr[j];
				}
			}
			swap(arr,i,index);
		}
	}
	public static void displayarr(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void swap(int[]arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public void displaysortedarr(int[]arr) {
		arr1= arr;
		len= arr.length;
		System.out.println("array before sorting");
		SelectionSort.displayarr(arr1);
		SelectionSort.ssort(arr1);  //sorting algo method called
		System.out.println("array after sorting");
		SelectionSort.displayarr(arr1);
	}
	public static void main(String[] args) {
		SelectionSort s1 = new SelectionSort();
		int []arrnew= {1,23,78,5,9,90};
		s1.displaysortedarr(arrnew);
	}

}
