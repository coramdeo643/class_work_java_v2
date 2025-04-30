package _my_test._self_study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page433_ChangeBackground extends JFrame {

    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListener listener = new MyListener();

    public Page433_ChangeBackground() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ChangeBackground");
        this.setVisible(true);
        panel = new JPanel();
        button1 = new JButton("Turn off the light");
        button1.addActionListener(listener);
        panel.add(button1);
        button2 = new JButton("Turn on the light");
        button2.addActionListener(listener);
        panel.add(button2);
        this.add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                panel.setBackground(Color.BLACK);
            } else if (e.getSource() == button2) {
                panel.setBackground(Color.WHITE);
            }
        }
    }

    public static void main(String[] args) {
        Page433_ChangeBackground t = new Page433_ChangeBackground();
    }

}
