package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    //Constructor

    //DVD obj by title
    public DigitalVideoDisc(String title) {
        super(title);
    }

    //DVD obj by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    //DVD by category, title, cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super(title, category, cost);
    }

    //DVD by director, category, title,cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(title, director, category, cost);
    }




/*
    public String toString(){
        return "DVD - Title : " + this.getTitle() + " / Category : " + this.getCategory() + " / Director : " + this.getDirector() + " / Length : " + this.getLength() + " / Price : " + this.getCost() + "\n";
    }
    */

    //commit for pullrequest

    //toString method
    @Override
    public String toString() {
        return "DVD - Title : " + this.getTitle() + " - Category : " + this.getCategory() + " - Director : " + this.getDirector() + " - Length : " + this.getLength() + " - Price : " + this.getCost() + "\n";
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
}
