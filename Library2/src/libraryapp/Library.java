package libraryapp;

public class Library {

    public static void main(String[] args) {

        LibraryItem harryPotter1 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Sorcerer's Stone")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(4).build();

        LibraryItem harryPotter2 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Chamber of Secrets")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(2).build();

        LibraryItem harryPotter3 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Prisoner of Azkaban")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(3).build();

        LibraryItem harryPotter4 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Goblet of Fire")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(5).build();

        LibraryItem harryPotter5 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Order of the Phoenix")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(1).build();

        LibraryItem harryPotter6 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Half Blood Prince")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(0).build();

        LibraryItem harryPotter7 = new LibraryItem.LibraryItemBuilder("Harry Potter and the Deathly Hallows")
                .educationalContent(false).checkoutDurationInDays(5).quantityAvailable(6).build();

        // Print the string with object info
        System.out.println(harryPotter1);
        // prints "Library Item: Harry Potter and the Sorcerer's Stone, 4 available, 5 day checkout period"

        // Print the ID of first Harry Potter
        System.out.println(harryPotter1.getId()); // prints "113355790"

        // Print the ID of the 6th Harry Potter book
        System.out.println(harryPotter6.getId()); // prints "113355795"

        // Print the quantity available of the 3rd Harry Potter book
        System.out.println(harryPotter3.getQuantityAvailable()); // prints "3"
    }

}