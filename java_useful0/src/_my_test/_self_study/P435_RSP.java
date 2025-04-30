package _my_test._self_study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class P435_RSP extends JFrame implements ActionListener {
    final int S = 0;
    final int R = 1;
    final int P = 2;

    private JPanel panel;
    private JLabel output, information;
    private JButton rock, scissor, paper;

    public P435_RSP() {
        setTitle("Rock Scissor Paper!");
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(new GridLayout(0,3));

        information = new JLabel("아래의 버튼 중에서 하나를 클릭!");
        output = new JLabel("Good luck!");
        rock = new JButton("Scissor");
        paper = new JButton("Rock");
        scissor = new JButton("Paper");

        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);

        panel.add(rock);
        panel.add(paper);
        panel.add(scissor);

        add(information, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        P435_RSP f = new P435_RSP();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        int user = Integer.parseInt(" "+b.getText());

        Random random = new Random();
        int computer = random.nextInt(3);
        if (user == computer) {
            output.setText("Draw");
        } else if (user == (computer+1)%3) {
            output.setText(user + " user win");
        } else {
            output.setText(computer + " computer win");
        }
    }
} // end of class
