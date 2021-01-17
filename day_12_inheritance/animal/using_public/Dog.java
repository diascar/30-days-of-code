package animal;

public class Dog extends Animal {

    public Dog(int age) {
        //invoking the superclass constructor
        super(age);
        System.out.println("A dog has been created.");
    }

    public void bark() {
        System.out.println("ruff, ruff!");
    }
    
    public void run() {
        System.out.println("A dog is running.");
    }
}