
public class Day20 {

    public static <E> void printArray( E[] arr) {
        for (E element: arr) {
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        // since <E> is an object, you can't use int ( a primitive), you have to use Integer (a class)
        Integer[] numArray = {1, 2, 3, 4};
        String[] strArray = {"a", "b", "c"};

        printArray(numArray);
        printArray(strArray);
    }
}