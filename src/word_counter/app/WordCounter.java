package word_counter.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter extends JFrame implements ActionListener {
    JLabel label1, label2;
    JButton btn;
    JTextArea textArea;

    WordCounter() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Word Counter App");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xDCDCDC));

        // Text Area
        textArea = new JTextArea("Text here...");
        textArea.setBounds(25, 90, 725, 300);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        // Labels
        label1 = new JLabel("Words: ");
        label1.setBounds(25, 25, 200, 50);

        label2 = new JLabel("Characters: ");
        label2.setBounds(500, 25, 200, 50);

        btn = new JButton("Check info");
        btn.setBounds(25, 410, 200, 50);
        btn.setFont(new Font("Arial", Font.BOLD, 18));

        btn.addActionListener(this);

        this.add(textArea);
        this.add(label1);
        this.add(label2);
        this.add(btn);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textArea.getText();
        String[] words = str.split("\\s");

        if (e.getSource() == btn) {
            label1.setText("Words: " + words.length);
            label2.setText("Characters: " + str.length());
        }
    }

    public static void main(String[] args) {
        WordCounter app = new WordCounter();
    }
}
