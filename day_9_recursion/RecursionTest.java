public class RecursionTest {
    public static int Somatorio(int N) {
        //base case
        if (N == 1) {
            return 1;
        }
        //recursive case 
        else {
            return N + Somatorio(N - 1);
        }
    }
    
    public static int Fatorial(int n) {
        if (n <= 1) {
            return 1;
        } 
        
        else {
            return n * Fatorial(n - 1);
        }
    }

    public static int Expon(int n, int p) {
        if (p <= 0) {
            return 1;
        } else {
            return n * Expon(n, p - 1);
        }
    }

    public static int Fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return Fib(n -1) + Fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Somatorio(3));
        System.out.println(Fatorial(5));
        System.out.println(Expon(2,2));
        System.out.println(Expon(2,3));
        System.out.println(Expon(2,4));

        for (int i = 0; i <= 20; i ++) {
            System.out.println(Fib(i));
        }

    }
}