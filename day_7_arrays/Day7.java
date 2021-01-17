import java.util.Scanner;
import java.util.Arrays;

public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static int[] reverse(int[] ar) {
        int n = ar.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = ar[n - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int i: reverse(arr)) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
