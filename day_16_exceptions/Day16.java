import java.util.Scanner;

public class Day16 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        

        try {
        String sVar = scan.next();
        int iVar = Integer.parseInt(sVar);
        System.out.println(sVar);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}