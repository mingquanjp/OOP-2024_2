package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>(); //dynamic list

    public void addDVD(DigitalVideoDisc item){
        itemsInStore.add(item);
        System.out.println("The dvd with title " + item.getTitle() + " has been added to the cart");
    }

    public void removeDVD(DigitalVideoDisc item) {
        if (itemsInStore.remove(item)) {
            System.out.println("The dvd with title " + item.getTitle() + " has been removed from the cart");
        } else {
            System.out.println("Can not found the dvd with title " + item.getTitle());
        }
    }

  public void displayStore(){
        System.out.println("**********************CART***********************\n");
        if (itemsInStore.isEmpty()) {
            System.out.println("There are no dvds in the store");
        }else{
            for(int i=0; i<itemsInStore.size(); i++){
                int j=i+1;
                System.out.println(j + ". " + itemsInStore.get(i).toString());
            }
        }
  }

}
