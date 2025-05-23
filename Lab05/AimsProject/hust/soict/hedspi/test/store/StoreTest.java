package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        // Tạo các DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "George Lucas",128, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 29.95f);
        // Thêm DVD vào cửa hàng
      //  store.addDVD(dvd1);
       // store.addDVD(dvd2);
       // store.addDVD(dvd3);
        // Hiển thị  DVD trong cửa hàng
        store.displayStore();
        // Thử xóa DVD tồn tại
       // store.removeDVD(dvd2);
        // Thử xóa DVD 0 tồn tại
       // store.removeDVD(dvd4);
        // Hiển thị DVD sau khi xóa
        store.displayStore();
    }

}
