package library.main;

import library.books.Author;
import library.books.PublishingCompany;
import library.enums.BookTypes;
import library.libraryitems.Book;

public class Library {

    public static void main(String[] args) {
        // check to ensure id is still being created for classes extended from LibraryItem
        // also test Reservable interface
        Book freakonomics = new Book("Freakonomics", 5, true,
                true,2003, 543, "Hard",
                BookTypes.NOVEL, new PublishingCompany("William Morrow"),
                new Author("Steven", "Dubner"), new Author("Stephen", "Levitt"));
        System.out.println(freakonomics.id);
        freakonomics.isReservable();
        freakonomics.isLoanable();

        // saving multiple authors to an array list - test that it prints
        System.out.println(freakonomics.getAuthors());

    }
}
