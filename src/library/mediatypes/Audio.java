package library.mediatypes;

import library.libraryitems.Media;

public class Audio extends Media {

    private String artistOrNarrator;
    private boolean music;

    public Audio(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                 String producer, boolean matureAudiencesOnly, boolean needComputerToUse, String genre, String artistOrNarrator,
                 boolean music, float duration) {
        super(name, checkoutDurationInDays, stocked, educationalContent, producer, matureAudiencesOnly,
                needComputerToUse, genre, duration);
        setArtistOrNarrator(artistOrNarrator);
        setMusic(music);
    }

    public String getArtistOrNarrator() {
        return artistOrNarrator;
    }

    public void setArtistOrNarrator(String artistOrNarrator) {
        this.artistOrNarrator = artistOrNarrator;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public void isItMusic() {
        System.out.println(music ? "This is music!" : "This is an audio book!");
    }
}
