public class Recursive_Exponent {
    public static void main(String[] args) {
        System.out.println(exp(2, 4));
    }

    public static int exp(int num1, int num2) {
        if(num2==0) {
            return 1;
        }
        return exp(num1, num2-1)*num1;
    }
}
