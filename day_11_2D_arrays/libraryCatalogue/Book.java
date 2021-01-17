package libraryCatalogue;

public class Book {

    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;


//constructor
    public Book(String bookTitle, int bookPageCount, int BookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = BookISBN;
        isCheckedOut = false;
    }

//getters

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

//setters
    public void setIsCheckedOut(boolean checkedOut, int currentDayCheckedOut) {
        this.isCheckedOut = checkedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day; 
    }
}