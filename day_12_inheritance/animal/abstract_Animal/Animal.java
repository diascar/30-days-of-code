public abstract class Animal {
    public int age;

    //constructor and non-abstract methods
    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created.");
    }

    public void eat() {
        System.out.println("An Animal is eating");
    }

    public void sleep() {
        System.out.println("An animal is sleeping.");
    }

    //abstract methods
    public abstract void speak();
    //or public abstract speak();


    public static void main(String[] args) {
        //Animal a = new Animal(5); can't be instantiated since it's an abstract class!
        Dog d = new Dog(13);
        d.run();
        d.speak();
        d.eat();
        d.sleep();
        Cat c = new Cat(7);
        c.speak();
        c.eat();
        c.sleep();
        //casting example
        Object dog = new Dog(8);
        Dog realDog = (Dog) dog;
        Object str = "est";
        String realStr = (String) str;

        //overriden methods are preserved after casting
        Dog doggy = new Dog(12);
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
            //A dog is sleeping
        }
        doggy.sleep();
        //A dog is sleeping
    }
}

class Dog extends Animal {

    public Dog(int age) {
        //invoking the superclass constructor
        super(age);
        System.out.println("A dog has been created.");
    }

    @Override
    public void speak() {
        System.out.println("ruff, ruff!");
    }
    
    public void run() {
        System.out.println("A dog is running.");
    }

    @Override
    //overriding a non-abstract method
    public void sleep() {
        System.out.println("A dog is sleeping");
    }
    }

class Cat extends Animal {
    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created!");
    }

    @Override
    public void speak() {
        System.out.println("meow.");
    }

    public void scratch() {
        System.out.println("A cat is scratching.");

    }
}