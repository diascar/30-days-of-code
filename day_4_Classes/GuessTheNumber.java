import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
        int theNUMBER;
        int max;
        Scanner scan = new Scanner(System.in);

//constructor
    public GuessTheNumber() {
        Random rand = new Random();
        setMax();
        System.out.println(max);
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scan.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big.");
            } else if (move < theNUMBER) {
                System.out.println("your number is too small.");
            } else {
                System.out.println("You got it");
                break;
            }
        }
    }
// getters and setters

    public int getMax() {
        return this.max;
    }

    public void setMax() {
        System.out.println("Set a max number!");
        int maxNumber = scan.nextInt();
        this.max = maxNumber;
    }
    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range.");
        }
    }

    public static void main(String[] args) {
        //instantiating an object of the class GuessTheNumber
        GuessTheNumber guessGame = new GuessTheNumber();

        //calling the method .play()
        // System.out.println("Set the max number for the game!");
        // int MAX = scan.nextInt();
        // guessGame.setMax(MAX);
        System.out.println("Welcome to the game! Choose a number between 0 and " + guessGame.getMax());
        guessGame.play();

    }
}