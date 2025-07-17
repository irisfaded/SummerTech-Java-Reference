public class Recursion {
    public static void main(String[] args) {
        // fibonacci recursion printing the sixth number in the fibonacci sequence
//        System.out.println(fib(6));

        // reverse string recursion
//        System.out.println(reverse("hello", 0));

        // factorial recursion
        System.out.println(factorial(5));

        // palindrome
        // test cases: madam -> true, civic -> true, redivider -> true, motor -> false, hello -> false
//        System.out.println(palindrome("madam", 0));

    }

    // fibonacci recursion
    public static int fib(int num) {
        if(num == 2 || num ==1){
            return 1;
        }
        return fib(num-2) + fib(num-1);
    }
    // reverse string recursion
    public static String reverse(String thing, int i) {
        if(i == thing.length()-1) {
            return ""+thing.charAt(i);
        }
        return reverse(thing, i+1) + thing.charAt(i);
    }

    // factorial recursion
    public static int factorial(int num) {
        if(num == 1){
            return 1;
        }
        return factorial(num-1)*num;
        // f(5) -> f(4)*5
        // f(3)*4*5
        // f(2)*3*4*5
        // f(1)*2*3*4*5

    }
    // palindrome recursion
    public static boolean palindrome(String thing, int i) {
        if(i > thing.length()-1){
            return true;
        }
        else if(thing.charAt(i) != thing.charAt((thing.length()-1)-i) && i <= thing.length()-1) {
            return false;
        }
        return palindrome(thing, i+1);
    }
}