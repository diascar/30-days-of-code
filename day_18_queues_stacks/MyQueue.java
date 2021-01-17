import java.util.LinkedList;
import java.util.Scanner;

public class MyQueue {

    LinkedList<Character> stack = new LinkedList<Character>();
    LinkedList<Character> queue = new LinkedList<Character>();

    MyQueue() {};

    public void pushCharacter(char ch) {
        this.stack.add(ch);
    }

    public void enqueueCharacter(char ch) {
        this.queue.add(ch);
    }

    public char popCharacter() {
        char lst_char = this.stack.getLast();
        this.stack.removeLast();
        return lst_char;
    }

    public char dequeueCharacter() {
        char fst_char = this.queue.getFirst();
        this.queue.removeFirst();
        return fst_char;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        MyQueue obj = new MyQueue();

        for (int i = 0; i < s.length(); i++ ) {
            obj.pushCharacter(s.charAt(i));
            obj.enqueueCharacter(s.charAt(i));
        }

        boolean isPalindrome = true;

    for (int i = 0; i < s.length(); i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("The word " + s + " is a palindrome.");
    } else {
        System.out.println("Thw word " + s + " is not a palindrome.");
    }

    }
}