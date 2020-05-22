package library.books;

import library.enums.BookTypes;
import library.libraryitems.Book;

public class NonFiction extends Book {

    private String subject;

    public NonFiction(String name, int checkoutDurationInDays,  boolean stocked, boolean educationalContent,
                      int publicationYear, int numOfPages, String hardOrSoftCover, String publisher,
                      BookTypes bookTypes, String firstName, String lastName, String subject) {
        super(name, checkoutDurationInDays,  stocked, educationalContent, publicationYear, numOfPages,
                hardOrSoftCover, publisher, bookTypes, firstName, lastName);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}