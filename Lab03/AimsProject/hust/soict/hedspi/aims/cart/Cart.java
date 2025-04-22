package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {

    private int qtyOrdered =0;
    public static final int MAX_NUMBERS_ORDERED =20;
    private  DigitalVideoDisc itemOrdered [] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    //add DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc item){
        if(qtyOrdered == MAX_NUMBERS_ORDERED ){
            System.out.println("The cart is almnost full");
        }else{
            itemOrdered[qtyOrdered] = item;
            qtyOrdered++;
            System.out.println("The dvd with title " + item.getTitle() + " has been added to the cart");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc dvd : dvdList){
            if(qtyOrdered == MAX_NUMBERS_ORDERED){
                System.out.println("The cart is almnost full");
                break;
            }
            itemOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("The dvd with title " + dvd.getTitle() + " has been added to the cart");
        }
    }




    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("Do not have enough space to add both DVD");
        }else{
            if(qtyOrdered == MAX_NUMBERS_ORDERED - 1){
                itemOrdered[qtyOrdered++]=dvd1;
                System.out.println("The dvd with title " + dvd1.getTitle() + " has been added to the cart");
                System.out.println("After add dvd1,the cart is full, cant not add dvd2");
            }else {
                itemOrdered[qtyOrdered++] = dvd1;
                System.out.println("The dvd with title " + dvd1.getTitle() + " has been added to the cart");
                itemOrdered[qtyOrdered++] = dvd2;
                System.out.println("The dvd with title " + dvd2.getTitle() + " has been added to the cart");
            }

        }
    }

    public void printCart(){
        System.out.println("***********************CART***********************\n");
        for(int i =0 ;i < qtyOrdered; i++){

                int j = i + 1;
                System.out.println(j + ". " + itemOrdered[i].toString());

        }
        System.out.println("Total cost : " + totalCost() + "\n");
        System.out.println("***********************CART***********************\n");

    }



    //remove DVD to cart
    boolean found =false;
    public void removeDigitalVideoDisc(DigitalVideoDisc item){
        if ( qtyOrdered ==0){
            System.out.println("The cart has no DVD");
        }else{
            //search the disc
            for (int i=0; i<qtyOrdered;i++){
                if(itemOrdered[i].equals(item)){
                    found =true;
                    //If DVD match, take all the dvd right of itemOrder[i] to the left
                    for(int j=i; j< qtyOrdered -1; j++){
                        itemOrdered[j] = itemOrdered[j+1];
                    }
                    itemOrdered[qtyOrdered-1] = null;
                    qtyOrdered--;
                    System.out.println("The DVD with title " + item.getTitle() + " has been removed from the cart");
                }
            }
            if(!found){
                System.out.println("The DVD is not match with any DVD in the cart");
            }
        }


    }
    float total =0;
    public float totalCost(){
        total = 0;
        for (int i=0; i< qtyOrdered;i++){
            total+=itemOrdered[i].getCost();
        }
        return total;
    }


    public void searchByTitle(String title){
        boolean found = false;
        for(int i =0; i< qtyOrdered;i++){
            if (itemOrdered[i].isMatch(title)){
                System.out.println("We found your DVD " + itemOrdered[i].toString());
                found = true;
            }
        }
        if(!found){
            System.out.println("The cart has no DVD with title " + title);
        }
    }
    public void searchById(int id){
        boolean found = false;
        for(int i=0; i< qtyOrdered;i++){
            if(itemOrdered[i].getId() == id){
                System.out.println("We found your DVD :  " + itemOrdered[i].toString());
                found = true;
            }
        }
        if(!found){
            System.out.println("The cart has no DVD with id " + id);
        }
    }



}
