package animal;

public class Cat extends Animal {
    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created!");
    }

    public void meow() {
        System.out.println("meow.");
    }

    public void scratch() {
        System.out.println("A cat is scratching.");

    }
}