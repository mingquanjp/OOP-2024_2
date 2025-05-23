package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    //constructor
    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }

    public String getTitle() {

        return title;
    }

    public int getLength() {

        return length;
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR : DVD length is non-positive");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Track track = (Track) obj;
        if (this.getTitle().equals(track.getTitle())){
            return true;
        }else{
            return false;
        }


    }
}
