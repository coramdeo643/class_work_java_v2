package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame3 extends JFrame implements ActionListener {
    private JButton[] buttons;
    private String[] strings = {"Red", "Orange", "Yellow", "Green", "Blue", "Navy", "Purple"};
    private JPanel panel;
    private JLabel player;

    public ColorChangeFrame3() {
        initData();
        setInit();
        addEventListener();
    }

    private void initData() {
        setSize(580, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon pIcon = new ImageIcon("images/player.png");
        player = new JLabel(pIcon);
        player.setSize(100, 100);
        player.setLocation(0, 300);

        buttons = new JButton[7];
        for (int i = 0; i < 7; i++) {
            buttons[i] = new JButton(strings[i]);
        }
        panel = new JPanel();
    }

    private void setInit() {
        setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setLocation(0, 30);
        panel.setSize(580, 270);
        for (int i = 0; i < 7; i++) {
            add(buttons[i]);
            buttons[i].setSize(80, 30);
            buttons[i].setLocation((i * 80), 0);
        }
        add(panel);
        add(player);
        setVisible(true);
    }

    private void addEventListener() {
        for (int i = 0; i < 7; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selButton = (JButton) e.getSource();
        if (selButton == buttons[0]) {
            panel.setBackground(Color.RED);
        } else if (selButton == buttons[1]) {
            panel.setBackground(Color.ORANGE);
        } else if (selButton == buttons[2]) {
            panel.setBackground(Color.YELLOW);
        } else if (selButton == buttons[3]) {
            panel.setBackground(Color.GREEN);
        } else if (selButton == buttons[4]) {
            panel.setBackground(Color.BLUE);
        } else if (selButton == buttons[5]) {
            panel.setBackground(new Color(0, 0, 128));
        } else if (selButton == buttons[6]) {
            panel.setBackground(new Color(100, 50, 250));
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame3();
    } // end of main
}
//250429.1600.