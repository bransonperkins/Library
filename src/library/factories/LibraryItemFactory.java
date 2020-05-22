package library.factories;

import library.enums.BookTypes;
import library.enums.LibraryItemEnums;
import library.libraryitems.Book;
import library.libraryitems.LibraryItem;

public class LibraryItemFactory {

    public static LibraryItem CreateLibraryItem(LibraryItemEnums item) {
        LibraryItem x = null;

        if (item == null) {
            return null;
        }

//        switch(item) {
//            case BOOK:
//                x = new Book(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
//                int publicationYear, int numOfPages, String hardOrSoftCover, BookTypes bookTypes, String firstName,
//                    String lastName, String publisher);
//            case MEDIA:
//                break;
//            case PERIODICAL:
//                break;
//        }
//    }
}