package Sorts;

public class InsertionSort {
    public static void main(String[] args) {
        // insertion sort video: https://www.youtube.com/watch?v=JU767SDMDvA
        // w3schools insertion sort cool: https://www.w3schools.com/dsa/dsa_algo_insertionsort.php
        int[] unsortedArr= { 6, 10, 4, 2, 9, 8, 5};
        int[] sortedArr = insertionSort(unsortedArr);
        for( int num : sortedArr) {
            System.out.println(num);
        }
    }

    public static int[] insertionSort(int[] arr) {
        for(int i =0; i<=arr.length-1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j -1;
            }
        }
        return arr;
    }
}
