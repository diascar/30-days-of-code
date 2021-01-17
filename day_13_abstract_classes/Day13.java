abstract class Book {
    String title;
    String author;
    int price;

//parameterized constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    int price;

    //parameterized constructor
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public static void main(String[] args) {
        MyBook alchemist = new MyBook("The Alchemist", "Paulo Coelho", 248);
        alchemist.display();
    }

}