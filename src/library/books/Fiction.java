package library.books;

import library.enums.BookTypes;
import library.libraryitems.Book;

public class Fiction extends Book {

    private String genre;

    public Fiction(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                   int publicationYear, int numOfPages, String hardOrSoftCover, BookTypes bookTypes,
                   String firstName, String lastName, String publisher, String genre) {
        super(name, checkoutDurationInDays, stocked, educationalContent, publicationYear, numOfPages,
                hardOrSoftCover, bookTypes, firstName, lastName, publisher);
        setGenre(genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}