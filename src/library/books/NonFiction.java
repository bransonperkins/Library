package library.books;

import library.enums.BookTypes;
import library.libraryitems.Book;

public class NonFiction extends Book {

    private String subject;

    public NonFiction(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked,
                      int publicationYear, int numOfPages, String hardOrSoftCover, String author, String publisher,
                      BookTypes bookTypes, String subject) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, publicationYear, numOfPages,
                hardOrSoftCover, author, publisher, bookTypes);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}