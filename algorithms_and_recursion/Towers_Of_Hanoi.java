public class Towers_Of_Hanoi {
    public static void main(String[] args) {
        towers(7, 1, 2, 3);
    }

    public static void towers(int disk, int start, int mid, int end) {

        if(disk > 0) {
            towers(disk - 1, start, end, mid);
            System.out.println("Move disk " + disk + " from peg " + start + " to peg " + end);
            towers(disk - 1, mid, start, end);
        }

    }
}
