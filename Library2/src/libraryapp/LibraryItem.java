package libraryapp;

public class LibraryItem {
    // All final attributes besides counter... counter cannot change if it is declared as final
    private static int counter = 113355790;
    private final int id;
    private final String itemName;
    private final int quantityAvailable;
    private final int checkoutDurationInDays;
    private final boolean educationalContent;

    private LibraryItem(LibraryItemBuilder builder) {
        this.id = counter++;
        this.itemName = builder.itemName;
        this.quantityAvailable = builder.quantityAvailable;
        this.checkoutDurationInDays = builder.checkoutDurationInDays;
        this.educationalContent = builder.educationalContent;
    }

    // All getter, and NO setter to provide immutability
    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public int getCheckoutDurationInDays() {
        return checkoutDurationInDays;
    }

    public boolean isEducationalContent() {
        return educationalContent;
    }

    @Override
    public String toString() {
        return "Library Item: " + this.itemName + ", " + this.quantityAvailable + " available, "
                + this.checkoutDurationInDays + " day checkout period";
    }

    public static class LibraryItemBuilder {
        private static int counter = 113355790;
        private final int id;
        private final String itemName;
        private int quantityAvailable;
        private int checkoutDurationInDays;
        private boolean educationalContent;

        public LibraryItemBuilder(String itemName) {
            this.id = counter++;
            this.itemName = itemName;
        }

        public LibraryItemBuilder educationalContent(boolean educationalContent) {
            this.educationalContent = educationalContent;
            return this;
        }

        public LibraryItemBuilder checkoutDurationInDays(int checkoutDurationInDays) {
            this.checkoutDurationInDays = checkoutDurationInDays;
            return this;
        }

        public LibraryItemBuilder quantityAvailable(int quantityAvailable) {
            this.quantityAvailable = quantityAvailable;
            return this;
        }

        public int getId() {
            return id;
        }

        // Return the finally constructed LibraryItem object
        public LibraryItem build() {
            LibraryItem libraryItem = new LibraryItem(this);
            validateLibraryItemObject(libraryItem);
            return libraryItem;
        }

        private void validateLibraryItemObject(LibraryItem libraryItem) {

        }
    }
}