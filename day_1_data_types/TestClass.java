import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
    int var_i;
    double var_d;
    String var_s;
    Scanner scan = new Scanner(System.in);
    
    var_i = scan.nextInt();
    var_d = scan.nextDouble();
    var_s = scan.next();
    scan.close();
    
    System.out.println(var_i);
    System.out.println(var_d);
    System.out.println(var_s);
    }
}
