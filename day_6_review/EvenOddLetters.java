import java.util.Scanner;

public class EvenOddLetters {

    public static void printEvenOdd(String word) {

        char[] sArray = word.toCharArray();

        String even = "";
        String odd = "";

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                //System.out.print(sArray[i]);
                even = even + sArray[i];
            } else {
                odd = odd + sArray[i];
            }
        }
        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String[] words = new String[T];

        for (int i = 0; i < T; i++) {
            words[i] = scan.next();
        }
        
        for (String word: words) {
            printEvenOdd(word);
        }
    }
}