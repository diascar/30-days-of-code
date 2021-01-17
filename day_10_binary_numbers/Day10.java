import java.util.Arrays;
import java.util.Collections;

public class Day10 {

    public static String toBinaryString(int num) {
        String binString = "";
        if (num == 0) {
            binString = "0";
            return binString;
        }
        else if (num == 1) {
            binString = "1";
            return binString;
        }
        else {
            binString = toBinaryString(num / 2) + Integer.toString(num % 2) + binString;
            return binString;
        }
    }

    public static int countOnes(String s) {
        int size = s.length();
        int[] lista = new int[size];
        int acc = 0;

        for (int i = 0; i < size; i++) {
            lista[i] = acc;
            if (s.charAt(i) == '1') {
                acc++;
            } else {
                lista[i] = acc;
                acc = 0;
            }
        }
        lista[size - 1] = acc;

        return Arrays.stream(lista).max().getAsInt();

    }

    public static void main(String[] args) {
        // for (int i = 0; i < 1000; i++) {
        //     System.out.println(toBinaryString(125) == Integer.toBinaryString(125));
        // }
        System.out.println(countOnes(toBinaryString(125)));
        System.out.println(countOnes(toBinaryString(13)));

    }
}