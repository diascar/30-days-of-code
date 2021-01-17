public class Animal {
    public int age;

    //constructor
    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created.");
    }

    public void eat() {
        System.out.println("An Animal is eating");
    }


    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog(13);
        d.run();
        d.bark();
        Cat c = new Cat(7);
        c.meow();
    }
}

class Dog extends Animal {

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

class Cat extends Animal {
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