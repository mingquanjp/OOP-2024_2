package hust.soict.hedspi.test.screen.customer.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.screen.customer.controller.CartController;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.naming.LimitExceededException;

public class TestViewCartScreen extends Application {
    public static Cart cart;
    private Store store;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/hust/soict/hedspi/aims/screen/customer/view/Cart.fxml"));
        CartController viewCartController = new CartController(cart,store);
        fxmlLoader.setController(viewCartController);
        Parent root = fxmlLoader.load();

        stage.setTitle("Cart");
        stage.setScene(new Scene(root));
        stage.show();

    }
    public static void main(String[] args) throws LimitExceededException {
        cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 19.8f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 18.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.9f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        launch(args);
    }
}
