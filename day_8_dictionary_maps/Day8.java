import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Day8 {

    static Scanner scan = new Scanner(System.in);

    int N;

    Map<String, String> phoneBook = new HashMap<String, String>();

    public void setN() {
        this.N = Integer.parseInt(scan.nextLine());
    }

    public void updatePB(String[] sa) {
        System.out.println(sa.length);
        if (sa.length == 2) {
            this.phoneBook.put(sa[0], sa[1]);
        }
    }

    public String[] parseLine() {
        String[] line = scan.nextLine().split(" ");
        return line;
    }

    public void getPairs() {
        while (scan.hasNext()) {
            String k = scan.next();
                if (this.phoneBook.containsKey(k)) {
                    System.out.println(k + "=" + this.phoneBook.get(k));
                }
                else {
                    System.out.println("Not found");
                }
            }
        System.out.println("No more inputs");
        scan.close();
    }

    public static void main(String[] args) {

         Day8 test = new Day8();
        test.setN();

        for (int i = 0; i < test.N; i++) {
            test.updatePB(test.parseLine());
        }

        test.getPairs();
    }
}