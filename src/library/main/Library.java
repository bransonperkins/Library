package library.main;

import library.books.Fiction;
import library.libraryitems.Book;
import library.libraryitems.SubscriptionPeriods;
import library.periodicals.Newspaper;

public class Library {

    public static void main(String[] args) {
        Book harryPotter1 = new Book("Harry Potter", 1, 5, 1.99,
                true, 2003, 543, "Hard",
                "J. K. Rowling", "Scholastic Press");
        System.out.println(harryPotter1.toString());

        Fiction harryPotter2 = new Fiction("Harry Potter", 1, 5, 1.99,
                true, 2003, 543, "Hard",
                "J. K. Rowling", "Scholastic Press", "Fantasy/Adventure",
                true, false);
        System.out.println(harryPotter2.isBookIllustrated());

        Newspaper newsAndObserver = new Newspaper("Harry Potter", 1, 5, 1.99,
                true, SubscriptionPeriods.DAILY, true, 15);
        newsAndObserver.isItBlackAndWhite();
    }
}
