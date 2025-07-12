package Sorts;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort visualization video: https://www.youtube.com/watch?v=Cq7SMsQBEUw
        // bubble sort in 2 minutes: https://www.youtube.com/watch?v=xli_FI7CuzA
        int[] unsortedArray = { 6, 10, 4, 2, 9, 8, 5};
        int[] sortedArray = bubbleSort(unsortedArray);
        for( int num : sortedArray) {
            System.out.println(num);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for(int i =0; i<arr.length-1; i++) { // length-1 because indexes are from 0-9 not 0-10 for 10 numbers
            for(int j = 0; j<(arr.length-1)-i; j++) {
                // first iteration of i, j<8 to exclude last number. i=1
                // 2. j<7 because end of array is now sorted i=2
                // 3. j<6 i=3
                // 4. j<5 i=4
                // 5. j<4 i=5
                // 6. j<3 i=6
                // 7. j<2 i=7
                // 8. j<1 i=8
                // breaks after this because i=9 is not less than 9
                // largest number gets pushed to the front, then the end is guaranteed to be sorted
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
