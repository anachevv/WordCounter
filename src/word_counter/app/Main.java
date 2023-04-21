package word_counter.app;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click here");
        JTextArea area = new JTextArea("Enter text here...");
        JScrollPane scrollPane = new JScrollPane(area);

        area.setBounds(40, 30, 405, 300);
        frame.add(area);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
//        button.setBounds(145, 150, 100, 40);
//        frame.add(button);
//        frame.setSize(400, 500);
//        frame.setLayout(null);
//        frame.setVisible(true);
    }
}
