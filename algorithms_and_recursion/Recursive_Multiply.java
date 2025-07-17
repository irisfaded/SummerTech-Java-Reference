public class Recursive_Multiply {
    public static void main(String[] args) {
        System.out.println(mult(2, 3));
    }

    public static int mult(int num1, int num2) {
        if(num2 == 0) {
            return 0;
        }
        return mult(num1, num2-1)+num1;
    }
}
