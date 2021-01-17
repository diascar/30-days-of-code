public class Person {

    int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person(-1);
        Person p2 = new Person(10);
        Person p3 = new Person(16);
        Person p4 = new Person(18);

        p1.amIOld();
        p2.amIOld();
        p3.amIOld();
        p4.amIOld();
//unlike python, you either assign p1.age to a variable or you print it out.
//otherwise the compiler will return an error.
        System.out.println(p1.age);
        p1.yearPasses();
        System.out.println(p1.age);
        p1.yearPasses();
        p1.yearPasses();
        System.out.println(p1.age);
    }
}