import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        //custom function to print an array (instead of using Arrays.toString())
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        //Index: 0  1  2  3  4
        //Array:[0, 5, 3, 2, 1]

        //Index    0       1       2
        //Array:["bob", "sally", "max"] -> length 3

        //Declaring, 
        int[] intArray1;

        //Allocating,
        int[] intArray2 = new int[4];
        //all elements are initialized to zero.
        System.out.println(Arrays.toString(intArray2));
        //we can then assign new values
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        // Initializing
        int[] intArray3 = {5, 2, 9, 1, 3};
        System.out.println(Arrays.toString(intArray3));

        String[] stringArray1 = {"bananas", "apples", "pears"};
        printArray(intArray3);
        //trying to access array items out of bounds (index greater than array.length) will raise an exception
        //System.out.println(intArray2[10]);

        // Arrays function
        Arrays.sort(intArray3);

        Array.get(intArray2, 2);

        // foreach loop
        //this kind of loop might not return the array in its original order
        for (String s: stringArray1) {
            System.out.println(s);
        }

        //random objects from Array:
        // int index = Math.abs(rand.nextInt) % Array.length;
        
        
    }
}