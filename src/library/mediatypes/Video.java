package library.mediatypes;

import library.libraryitems.Media;

public class Video extends Media {

    private String dvdOrBluRay;
    private boolean colored;

    public Video(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked, String producer,
                 boolean matureAudiencesOnly, boolean needComputerToUse, String genre, float duration,
                 String dvdOrBluRay, boolean colored) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, producer, matureAudiencesOnly, needComputerToUse,
                genre, duration);
        setDvdOrBluRay(dvdOrBluRay);
        setColored(colored);
    }

    public String getDvdOrBluRay() {
        return dvdOrBluRay;
    }

    public void setDvdOrBluRay(String dvdOrBluRay) {
        this.dvdOrBluRay = dvdOrBluRay;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public void isVideoInColor() {
        System.out.println(colored ? "The video is in color." : "The video is not in color.");
    }
}
