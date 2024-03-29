package word_counter.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter extends JFrame implements ActionListener {
    JLabel label1, label2;
    JTextArea textArea;
    JButton btn;
    JScrollPane scrollPane;
    ImageIcon icon;

    WordCounter() {
        // App Initialization
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(790, 550);
        this.setTitle("Word Counter App");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xDCDCDC));
        this.setResizable(false);
        icon = new ImageIcon("./././images/icon.png");
        this.setIconImage(icon.getImage());

        // Text Area
        textArea = new JTextArea("Text here...");
        textArea.setBounds(25, 90, 725, 300);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Scroll Pane
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(25, 90, 725, 300);

        // Labels
        label1 = new JLabel("Words: ");
        label1.setFont(new Font("ArialRounded", Font.BOLD, 20));
        label1.setBounds(25, 25, 200, 50);
        label2 = new JLabel("Characters: ");
        label2.setFont(new Font("ArialRounded", Font.BOLD, 20));
        label2.setBounds(580, 25, 200, 50);

        // Button
        btn = new JButton("Check info");
        btn.setBounds(280, 410, 200, 50);
        btn.setFont(new Font("ArialRounded", Font.BOLD, 20));

        btn.addActionListener(this);

        // Adding
        this.add(scrollPane);
        this.add(label1);
        this.add(label2);
        this.add(btn);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String str = textArea.getText();
        String[] words = str.split("\\s");

        if (event.getSource() == btn) {
            label1.setText("Words: " + words.length);
            label2.setText("Characters: " + str.length());
        }
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}
