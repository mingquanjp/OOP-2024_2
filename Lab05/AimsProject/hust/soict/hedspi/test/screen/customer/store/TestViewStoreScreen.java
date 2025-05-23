package hust.soict.hedspi.test.screen.customer.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {
    private static Store store;
    public static void main(String[] args) {
        store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 19.8f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 18.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.9f);

        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", "Michael Jackson", 40, 15.44f, "Michael Jackson");
        CompactDisc cd2 = new CompactDisc("Back in Black", "Rock", "AC/DC", 53, 18.99f, "AC/DC");
        CompactDisc cd3 = new CompactDisc("The Eminem Show", "Hip-Hop", "Eminem", 62, 20.50f, "Eminem");

        Media cd4 = new CompactDisc("The Dark Side of the Moon", "Progressive Rock", "Pink Floyd", 13.25f);
        Media cd5 = new CompactDisc("Back in Blacks", "Rocks", "AC/DsC", 11.99f);

        Book book1 = new Book("Harry Potter", "Fantasy", 25.88f);




        store.addMedia(dvd1);
        store.addMedia(cd1);

        store.addMedia(dvd2);
        store.addMedia(cd2);

        store.addMedia(dvd3);
        store.addMedia(cd3);

        store.addMedia(cd4);
        store.addMedia(cd5);
        store.addMedia(book1);

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/hust/soict/hedspi/aims/screen/customer/view/Store.fxml"));
        ViewStoreController viewStoreController = new ViewStoreController(store);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();

        stage.setTitle("Store");
        stage.setScene(new Scene(root));
        stage.show();

    }
}
