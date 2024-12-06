package data_structure.sorting;

public class QuickSOrt {
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int p = low, q = high;
        while (p < q) {
            while (p < arr.length && arr[p] <= pivot) p++;
            while (q >= 0 && arr[q] > pivot) q--;
            if (p < q) {
                swap(arr, p, q);
            }
        }
        swap(arr, low, q);
        return q;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 78, 5, 9, 90};
        System.out.println("Original Array:");
        displayArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Quick Sort:");
        displayArray(arr);
    }
}
