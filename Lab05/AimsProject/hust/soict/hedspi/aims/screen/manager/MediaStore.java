package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media){
        this.media = media;
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(),Font.BOLD, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() +"$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if(media instanceof Playable){
            JButton playButton = new JButton("Play");
            playButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = createPlayDialog(media);
                    dialog.setVisible(true);
                    dialog.setSize(300, 300);
                    dialog.pack();
                }
            });
            container.add(playButton);
        }
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    static JDialog createPlayDialog(Media media) {
        JDialog playDialog = new JDialog();
        Container container = playDialog.getContentPane();
        playDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        container.add(Box.createRigidArea(new Dimension(10,10)));
        if(media instanceof DigitalVideoDisc dvd) {
            container.add(new JLabel("Playing DVD:" + dvd.getTitle()));
            container.add(new JLabel("DVD length:" + dvd.getLength() +" min"));
        } else if (media instanceof CompactDisc cd) {
            container.add(new JLabel("Playing CD: " + cd.getTitle()));
            container.add(new JLabel("Artist: " + cd.getArtist()));
            container.add(new JLabel("Length: " + cd.getLength() +" min"));

        }
        playDialog.setTitle("Play " + media.getTitle());
        return playDialog;
    }

}
