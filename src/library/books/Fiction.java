package library.books;

import library.enums.BookTypes;
import library.libraryitems.Book;

public class Fiction extends Book {

    private String genre;

    public Fiction(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                   int publicationYear, int numOfPages, String hardOrSoftCover, String publisher,
                   BookTypes bookTypes, String firstName, String lastName, String genre) {
        super(name, checkoutDurationInDays, stocked, educationalContent, publicationYear, numOfPages,
                hardOrSoftCover, publisher, bookTypes, firstName, lastName);
        setGenre(genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}