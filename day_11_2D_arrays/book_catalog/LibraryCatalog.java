
package librarycatalogue;

import java.util.Map;
import java.util.HashMap;

//since book is part of the same package it doesn't need to be imported.
//however, you have to compile both at the same time javac file1.java file2.java


public class LibraryCatalogue {

// A dictionary of strings and Book
    Map<String,Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

// constructors
    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;

    }

    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;

    }

//getters
    
    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public Map<String,Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

// setters

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

// INSTANCE METHODS (REMEMBER, THEY DO NOT CONTAIN THE "STATIC" KEYWORD)

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day "+
            (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }

    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());

        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay())
            + " because your book is " + daysLate + "days overdue");
        } else {
            System.out.println("Book returned. Thank you");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checkedout. "
        + "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod() + "."));

    }

    public static void main(String[] args) {
        // code application logic
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harryPotter = new Book("Harry Potter", 827132, 999999999);
        bookCollection.put("Harry Potter", harryPotter);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
}