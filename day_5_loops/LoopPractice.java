public class LoopPractice {

//static, so we need not to instantiate our class
// it can be called directly on our main function
    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 5) {
            System.out.println("The value of x is " + x);
            //x = x + 1
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        
        do {
            System.out.println("The value o x is " + x);
            x++;
        } while (x < 5);
    }

    public static void practiceForLoop() {
        for (int x = 0; x < 20; x++) {
            System.out.println("The value of x is " + x);
        }
    }

    public static void decrementForLoop() {
        for (int x = 10; x > 0; x--) {
            System.out.println("The value of x is " + x);
        }
    }

    public static void nestedLoops() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y ++) {
                System.out.println("(" + x + "," + y + ")");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("While loop");
        practiceWhileLoop();
        System.out.println("\nDo-While loop");
        practiceDoWhileLoop();
        System.out.println("\nFor Loop");
        practiceForLoop();
        System.out.println("\ndecremental For Loop");
        decrementForLoop();
        System.out.println("\nNested loops");
        nestedLoops();



    }
}