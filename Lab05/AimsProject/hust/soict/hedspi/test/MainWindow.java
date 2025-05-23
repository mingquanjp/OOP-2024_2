package hust.soict.hedspi.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Replace Screen Example");
        JPanel mainPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout); // Thiết lập CardLayout

        // --- Tạo màn hình 1 (Home) ---
        JPanel homePanel = new JPanel();
        homePanel.setBackground(Color.WHITE);
        homePanel.add(new JLabel("Màn hình chính"));
        JButton goToSecondScreenButton = new JButton("Chuyển sang màn hình 2");
        homePanel.add(goToSecondScreenButton);

        // --- Tạo màn hình 2 (Second Screen) ---
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.LIGHT_GRAY);
        secondPanel.add(new JLabel("Màn hình thứ 2"));
        JButton backButton = new JButton("Quay lại");
        secondPanel.add(backButton);

        // Thêm cả 2 panel vào mainPanel (với tên định danh)
        mainPanel.add(homePanel, "HOME");
        mainPanel.add(secondPanel, "SECOND");

        // --- Xử lý sự kiện nút ---
        goToSecondScreenButton.addActionListener(e -> {
            cardLayout.show(mainPanel, "SECOND"); // Chuyển sang màn hình 2
        });

        backButton.addActionListener(e -> {
            cardLayout.show(mainPanel, "HOME"); // Quay lại màn hình chính
        });

        // Thiết lập frame
        frame.add(mainPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
