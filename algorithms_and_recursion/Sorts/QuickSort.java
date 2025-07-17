package Sorts;

public class QuickSort {
    public static void main(String[] args) {
        int[] unsortedArr = { 7, 4, 10, 9, 5, 3, 1, 6, 2, 8};
        int[] sortedArr = quickSort(unsortedArr, 0, null);
        for(int num : sortedArr) {
            System.out.println(num);
        }

    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for( int j = low; j< high; j++) {
            if(arr[j] <= pivot) {
                i = i+1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = high;
        arr[high] = temp;
        return i+1;
    }

    public static int[] quickSort(int[] arr, int low, Integer high) {
        if(high == null) {
            high = arr.length -1;
        }
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
        return arr;
    }
}
