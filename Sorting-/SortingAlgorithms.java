package data_structure.sorting;

public class SortingAlgorithms {
    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }

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
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            swap(arr, 0, i);

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // Check if left child exists and is greater than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater than current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
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
        
        int[] heapArr = arr.clone();
        heapSort(heapArr);
        System.out.println("After Heap Sort:");
        displayArray(heapArr);
//        
//        int[] insertionArr = arr.clone();
//        insertionSort(insertionArr);
//        System.out.println("After Insertion Sort:");
//        displayArray(insertionArr);
//
//        int[] bubbleArr = arr.clone();
//        bubbleSort(bubbleArr);
//        System.out.println("After Bubble Sort:");
//        displayArray(bubbleArr);
//
//        int[] selectionArr = arr.clone();
//        selectionSort(selectionArr);
//        System.out.println("After Selection Sort:");
//        displayArray(selectionArr);
//
//        int[] quickArr = arr.clone();
//        quickSort(quickArr, 0, quickArr.length - 1);
//        System.out.println("After Quick Sort:");
//        displayArray(quickArr);
    }
}
