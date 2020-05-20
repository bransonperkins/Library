package library.books;

import library.libraryitems.Book;

public class Fiction extends Book {

    private String genre;
    private boolean novel;
    private boolean illustratedStory;

    public Fiction(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked,
                   int publicationYear, int numOfPages, String hardOrSoftCover, String author, String publisher,
                   String genre, boolean novel, boolean illustratedStory) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, publicationYear, numOfPages,
                hardOrSoftCover, author, publisher);
        setGenre(genre);
        setNovel(novel);
        setIllustratedStory(illustratedStory);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isNovel() {
        return novel;
    }

    public void setNovel(boolean novel) {
        this.novel = novel;
    }

    public boolean isIllustratedStory() {
        return illustratedStory;
    }

    public void setIllustratedStory(boolean illustratedStory) {
        this.illustratedStory = illustratedStory;
    }

    public String isBookIllustrated() {
        return illustratedStory ? "This book is either a graphic novel or a comic book." : "This book is not an " +
                "illustrated story.";
    }

}
