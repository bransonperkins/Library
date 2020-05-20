package library.books;

import library.libraryitems.Book;

public class NonFiction extends Book {

    private String subject;
    private String referenceOrTextbook;

    public NonFiction(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked,
                      int publicationYear, int numOfPages, String hardOrSoftCover, String author, String publisher,
                      String subject, String referenceOrTextbook) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, publicationYear, numOfPages,
                hardOrSoftCover, author, publisher);
        setReferenceOrTextbook(referenceOrTextbook);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getReferenceOrTextbook() {
        return referenceOrTextbook;
    }

    public void setReferenceOrTextbook(String referenceOrTextbook) {
        this.referenceOrTextbook = referenceOrTextbook;
    }
}