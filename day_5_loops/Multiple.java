import java.util.Scanner;

public class Multiple{

    int N;
    Scanner scan = new Scanner(System.in);

    public void setN() {
        this.N = scan.nextInt();
    }

    public int getN() {
        return this.N;
    }

    public static void main(String[] args) {
        
        Multiple mult = new Multiple();
        mult.setN();

        for (int i = 1; i <= 10; i++) {
            int n = mult.getN();
            System.out.println(n + " x " + i + " = " + n*i);
        }

    }
}