class Person {
    
    //instance variables
    String firstName;
    String lastName;
    int idNumber;

    //constructor
    Person() {}

    //parameterized constructor
    Person(String fn, String ln, int id) {
        this.firstName = fn;
        this.lastName = ln;
        this.idNumber = id;
    }
}

class Student extends Person {
    
    //instance variables
    int[] scores;

    Student(String fn, String ln, int id, int[] sc) {
        super(fn, ln, id);
        this.scores = sc;
    }

    public char calculate() {
        int total = 0;
        for (int i = 0; i < this.scores.length; i++) {
            total = total + this.scores[i];
        }

        double avg = total/this.scores.length;

        if (avg >= 90 && avg <= 100) {
            return 'O';
        }
        else if (avg >= 80 && avg < 90) {
            return 'E';
        }
        else if (avg >= 70 && avg < 80) {
            return 'A';
        }
        else if (avg >= 55 && avg < 70) {
            return 'P';
        }
        else if (avg >=40 && avg < 55) {
            return 'D';
        }
        else {
            return 'T';
        }
    }

    public static void main(String[] args) {
        int[] notas = {100, 80};
        Student HM = new Student("Heraldo", "Memelli", 8135627, notas);
        System.out.println(HM.calculate());

    }
}