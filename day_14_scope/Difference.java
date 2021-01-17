import java.util.Arrays;

public class Difference {
    //instance variables
    private int[] elements;
    public int maximumDifference;

    //parameterized constructor
    Difference(int[] arr) {
        Arrays.sort(arr);
        this.elements = arr;
    }

    public void computeDifference() {
        this.maximumDifference = this.elements[this.elements.length - 1] - this.elements[0];

    }


    public static void main(String[] args) {
        int[] a = {13, 7, 6, 45, 21, 9, 101, 102};
        Difference d = new Difference(a);
        d.computeDifference();
        System.out.println(d.maximumDifference);
    }
}