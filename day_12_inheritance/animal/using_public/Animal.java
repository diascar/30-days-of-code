package animal;

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
        d.eat();
        Cat c = new Cat(7);
        c.meow();
        c.eat();
        //.eat() method is inherited from parent class Animal.

        Animal o = new Dog(4);
        //it will work, but o will not have access to Dog methods

        Dog e = new Animal(4);
        //it will return an error.
    }
}


