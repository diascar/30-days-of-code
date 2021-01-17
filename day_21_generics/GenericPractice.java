public class GenericPractice {

    public static <T extends Comparable <T>> T findMax (T a, T b) {
        //a.compareTo(b) method return -1 if a < b; 0 if a == b and 1 if a > b.
        int n = a.compareTo(b);

        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));

        // will return an error if the class do not implements Comparable and override the compareTo() method.
        GenericPractice k = new GenericPractice();
        System.out.println(findMax(k, k));
    }
}