import java.util.Scanner;
import java.util.Arrays;

public class Day11 {

    public static Scanner scan = new Scanner(System.in);




    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        // System.out.println(arr[0].length);

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; i++) {
                System.out.println(Arrays.deepToString(Arrays.copyOfRange(arr, i, i+1)));
                // System.out.println(Arrays.toString(a));
            }
        }



    }
}