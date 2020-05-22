package library.libraryitems;

import library.books.PublishingCompany;
import library.enums.BookTypes;
import library.books.Author;

public class Book extends LibraryItem {

    private int publicationYear, numOfPages;
    private String hardOrSoftCover;
    private BookTypes bookTypes;
    private Author author;
    private PublishingCompany publishingCompany;

    public Book(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                int publicationYear, int numOfPages, String hardOrSoftCover, BookTypes bookTypes, String firstName,
                String lastName, String publisher) {
        super(name, checkoutDurationInDays, stocked, educationalContent);
        setPublicationYear(publicationYear);
        setNumOfPages(numOfPages);
        setHardOrSoftCover(hardOrSoftCover);
        setBookTypes(bookTypes);
        // pass in Author() created in the Author class
        setAuthor(new Author(firstName, lastName));
        setPublishingCompany(new PublishingCompany(publisher));
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getHardOrSoftCover() {
        return hardOrSoftCover;
    }

    public void setHardOrSoftCover(String hardOrSoftCover) { this.hardOrSoftCover = hardOrSoftCover; }

    public BookTypes getBookTypes() {
        return bookTypes;
    }

    public void setBookTypes(BookTypes bookTypes) {
        this.bookTypes = bookTypes;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public PublishingCompany getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(PublishingCompany publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    @Override
    public String toString() {
        return "You are checking out " + this.getName() + " by " + this.getAuthor() + " for a period of " +
                this.getCheckoutDurationInDays() + " days. " + "The late fee is $" + this.getCheckoutFee() +
                " if you don't return it within those " + this.getCheckoutDurationInDays() + " days.";
    }

}