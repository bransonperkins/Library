package library.books;

public class PublishingCompany {

    private String publisherName;

    public PublishingCompany(String publisherName) {
        setPublisherName(publisherName);
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "The publisher's name is: " + this.getPublisherName();
    }
}