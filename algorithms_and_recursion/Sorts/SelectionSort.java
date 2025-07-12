package Sorts;

public class SelectionSort {
    public static void main(String[] args) {
        // selection sort video: https://www.youtube.com/watch?v=g-PGLbMth_g
        int[] unsortedArr = { 7, 4, 10, 9, 5, 3, 1, 6, 2, 8};
        int[] sortedArr = selectionSort(unsortedArr);
        for( int num : sortedArr) {
            System.out.println(num);
        }
    }
    public static int[] selectionSort(int[] arr) {
        for(int i =0; i <= arr.length-1; i++) {
            int min = i; // the item at index i will always be sorted as per selection sort, so it will always be the min
            for(int j = i+1; j<=arr.length-1; j++) { // loop starting from the partition after sorted index i
                if(arr[j] < arr[min]) {
                    min = j; // new minimum index becomes j
                }
            }
            // at the end, the most minimum index in the unsorted partition will be swapped with the most minimum index in the sorted partition, making the new most minimum in the sorted part.
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
