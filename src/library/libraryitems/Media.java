package library.libraryitems;

public class Media extends LibraryItem {

    private String producer;
    private boolean matureAudiencesOnly;
    private boolean needComputerToUse;
    private String genre;
    private float duration;

    public Media(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                 String producer, boolean matureAudiencesOnly, boolean needComputerToUse, String genre, float duration) {
        super(name, checkoutDurationInDays, stocked, educationalContent);
        setMatureAudiencesOnly(matureAudiencesOnly);
        setProducer(producer);
        setNeedComputerToUse(needComputerToUse);
        setGenre(genre);
        setDuration(duration);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isMatureAudiencesOnly() {
        return matureAudiencesOnly;
    }

    public void setMatureAudiencesOnly(boolean matureAudiencesOnly) {
        this.matureAudiencesOnly = matureAudiencesOnly;
    }

    public boolean isNeedComputerToUse() {
        return needComputerToUse;
    }

    public void setNeedComputerToUse(boolean needComputerToUse) {
        this.needComputerToUse = needComputerToUse;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void needComputer() {
        System.out.println(needComputerToUse ? "A computer is needed to use this product." :
                "A computer is not needed to use this product");
    }

    public void thirteenYearsOrOlder() {
        System.out.println(matureAudiencesOnly ? "Children under the age of 13 cannot check this item out without " +
                "parent approval." : "This item can be checked out by this customer.");
    }

}
