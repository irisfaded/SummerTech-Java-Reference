public class Binary_Search {
    public static void main(String[] args) {
        // can only perform on sorted arrays
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        int target = 10;
        System.out.println("Is " + target + " in the array? " + binarySearchLoop(numbers, target));
        System.out.println("Is " + target + " in the array recursively? " + binarySearchRecursive(numbers, target, numbers.length-1, 0));


    }
    // without recursion
    public static boolean binarySearchLoop(int[] numbers, int target) {
        int high = numbers.length-1;
        int low = 0;
        boolean found = false;
        while(low <= high && !found) {
            int mid = (high+low)/2;
            if(target < numbers[mid]) {
                high = mid -1;
            } else if(target > numbers[mid]){
                low = mid +1;
            } else {
                found = true;
            }
        }
        return found;
    }

    // with recursion
    public static boolean binarySearchRecursive(int[] numbers, int target, int high, int low) {
        int mid = (high+low)/2;
        if(low > high) {
            return false;
        }
         else if(target < numbers[mid]) {
            return binarySearchRecursive(numbers, target, mid-1, low);
        } else if(target > numbers[mid]){
            return binarySearchRecursive(numbers, target, high, mid+1);
        } else {
            return true;
        }
    }
}
