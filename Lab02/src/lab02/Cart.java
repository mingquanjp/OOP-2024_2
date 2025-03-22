package lab02;

public class Cart {

    private int qtyOrdered =0;
    public static final int MAX_NUMBERS_ORDERED =20;
    private  DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    //add DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc item){
        if(qtyOrdered == MAX_NUMBERS_ORDERED -1){
            System.out.println("The cart is almnost full");
        }else{
            itemOrdered[qtyOrdered] = item;
            qtyOrdered++;
            System.out.println("The dvd with title " + item.getTitle() + " has been added to the cart");
        }
    }

    //remove DVD to cart
    public void removeDigitalVideoDisc(DigitalVideoDisc item){
        if ( qtyOrdered ==0){
            System.out.println("The cart has no DVD");
        }else{
            itemOrdered[--qtyOrdered]=item;
        }


    }
}
