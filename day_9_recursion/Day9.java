import java.util.Scanner;

public class Day9 {

    static Scanner scan = new Scanner(System.in);

    public static int factorial(int n) {
        if (n <= 1 && n > 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int N = scan.nextInt();
        
        System.out.println(factorial(N));

    }
}