package _my_test._self_study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P_434_Keypad extends JFrame implements ActionListener {
    private JTextField txt;
    private JPanel panel;

    public P_434_Keypad() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Calculator");
        txt = new JTextField(20);
        add(txt, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));
        add(panel, BorderLayout.CENTER);
        for (int i = 9; i >= 0; i--) {
            JButton btn = new JButton(""+i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100,40));
            panel.add(btn);
        } // end of for
        pack();

    } //

    @Override
    public void actionPerformed(ActionEvent e) {
        String actCommand = e.getActionCommand();
        txt.setText(txt.getText() + actCommand);
    }

    public static void main(String[] args) {
        P_434_Keypad k = new P_434_Keypad();
    }
} // end of class
