package library.books;

import library.enums.BookTypes;
import library.libraryitems.Book;

public class Fiction extends Book {

    private String genre;

    public Fiction(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked,
                   int publicationYear, int numOfPages, String hardOrSoftCover, String author, String publisher,
                   BookTypes bookTypes, String genre) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, publicationYear, numOfPages,
                hardOrSoftCover, author, publisher, bookTypes);
        setGenre(genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}