package library.libraryitems;

public class Book extends LibraryItem {

    private int publicationYear, numOfPages;
    private String hardOrSoftCover, author, publisher;

    public Book(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked, int publicationYear,
                int numOfPages, String hardOrSoftCover, String author, String publisher) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked);
        setPublicationYear(publicationYear);
        setNumOfPages(numOfPages);
        setHardOrSoftCover(hardOrSoftCover);
        setAuthor(author);
        setPublisher(publisher);
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

    public void setHardOrSoftCover(String hardOrSoftCover) {
        this.hardOrSoftCover = hardOrSoftCover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "You are checking out " + this.getName() + " by " + this.getAuthor() + " for a period of " +
                this.getCheckoutDurationInDays() + " days. " + "The late fee is $" + this.getCheckoutFee() +
                " if you don't return it within those " + this.getCheckoutDurationInDays() + " days.";
    }

}
