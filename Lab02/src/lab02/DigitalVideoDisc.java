package lab02;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;


    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }

    public float getCost() {
        return this.cost;
    }

    //DVD obj by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    //DVD obj by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    //DVD by category, title, cost
    public DigitalVideoDisc(String category,String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    //DVD by director, category, title,cost
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
}
