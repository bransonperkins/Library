package library.books;

import library.enums.BookTypes;
import library.libraryitems.Book;

public class NonFiction extends Book {

    private String subject;

    public NonFiction(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                      int publicationYear, int numOfPages, String hardOrSoftCover, BookTypes bookTypes,
                      PublishingCompany publisher, Author author, String subject) {
        super(name, checkoutDurationInDays,  stocked, educationalContent, publicationYear, numOfPages,
                hardOrSoftCover, bookTypes, publisher, author);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}