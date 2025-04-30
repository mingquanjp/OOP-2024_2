package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    public AddCompactDiscToStoreScreen(Store store) {
        super(store,"Add CD");
    }



    @Override
    protected JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(7,2,2,3));

        center.add(new JLabel("Enter the title : "));
        TextField title = new TextField(50);
        center.add(title);

        center.add(new JLabel("Enter the category : "));
        TextField category = new TextField(50);
        center.add(category);

        center.add(new JLabel("Enter the director : "));
        TextField director = new TextField(50);
        center.add(director);

        center.add(new JLabel("Enter the length : "));
        TextField length = new TextField(50);
        center.add(length);

        center.add(new JLabel("Enter the cost : "));
        TextField cost = new TextField(50);
        center.add(cost);

        center.add(new JLabel("Enter the artist : "));
        TextField artist = new TextField(50);
        center.add(artist);

        center.add(new JLabel());
        JButton button = new JButton("Add");
        center.add(button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CompactDisc cd = new CompactDisc(title.getText(), category.getText(),
                        director.getText(), Integer.parseInt(length.getText()), Float.parseFloat(cost.getText()), artist.getText());
                store.addMedia(cd);
                Container cp = new Container();
                cp.add(createCenter(), BorderLayout.CENTER);
                cp.revalidate();
                director.setText("");
                length.setText("");
                title.setText("");
                category.setText("");
                cost.setText("");
            }
        });

        return center;
    }
    public static void main(String[] args) {
        Store store = new Store();
        new AddCompactDiscToStoreScreen(store);

    }

}