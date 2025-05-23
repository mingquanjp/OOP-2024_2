package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AddItemToStoreScreen extends JFrame {
    Store store;

    public AddItemToStoreScreen(Store store, String title) {
        this.store = store;

        setTitle(title);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(createNorth(), BorderLayout.NORTH);
        add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
    }

    public JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        //north.add(createHeader());
        return north;

    }
    public JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");


        JMenuItem viewStore = new JMenuItem("View store");
        menu.add(viewStore);
        viewStore.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreManagerScreen(store);
            }
        });

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookItem = new JMenuItem("Add Book");
        smUpdateStore.add(addBookItem);
        addBookItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new AddBookToStoreScreen(store);
            }
        });


        JMenuItem addCDItem = new JMenuItem("Add CD");
        smUpdateStore.add(addCDItem);
        addCDItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCompactDiscToStoreScreen(store);
            }
        });


        JMenuItem addDVDItem = new JMenuItem("Add DVD");
        smUpdateStore.add(addDVDItem);
        addDVDItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddDigitalVideoDiscToStoreScreen(store);
            }
        });
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;

    }

    public JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.BOLD, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;

    }
    protected abstract JPanel createCenter();
}
