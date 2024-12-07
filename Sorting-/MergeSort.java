package data_structure.sorting;

public class MergeSort {
	//p- lower index , q- mid index  r -higher index
	public void mergesort(int[]arr, int p, int r) {
		if (p>=r) {
			return;
		}
		int q=(p+r)/2; //mid
		mergesort(arr,p,q);
		mergesort(arr,q+1,r);
		merge(arr,p,q,r);
	}
	public void createnewarr(int[]narr,int[]arr, int start,int end) {
		for(int i=start, j=0;i<=end;i++,j++) {
			narr[j]=arr[i];
		}
	}
	public void merge(int[]arr, int p,int q, int r) {
		int n1=q-p+1; //length of l array
		int n2 = r-q;//length of m array
		int[] l = new int[n1];
		int[] m = new int[n2];
		createnewarr(l,arr,p,q);
		createnewarr(m,arr,q+1,r);
		int i=0,j=0, k=p;
		while(i<n1 && j<n2) {
			if(l[i]<=m[j]) {
				arr[k]=l[i];
				i++;
			}else {
				arr[k]=m[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=l[i];
			i++; 
			k++;
		}
		while(j<n2) {
			arr[k]=m[j];
			j++; 
			k++;
		}
	}
	public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	 public static void main(String[] args) {
		 MergeSort m1= new MergeSort();
		 int []array1={1, 23, 78, 5, 9, 90};
		 int len= array1.length;
		 System.out.println("before sorting");
		 displayArray(array1);
		 m1. mergesort(array1, 0, len-1);
		 System.out.println("after sorting");
		 displayArray(array1);
	 }
}
