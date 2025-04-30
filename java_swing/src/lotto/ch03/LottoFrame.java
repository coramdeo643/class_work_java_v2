package lotto.ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LottoFrame extends JFrame implements ActionListener {

    private int testNumber = 45;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private int[] result = new int[6];

    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("Lotto Game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Game Start");
        lottoRandomNumber = new LottoRandomNumber();
    }

    private void setInitLayout() {
        add(button, BorderLayout.NORTH);
        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        result = lottoRandomNumber.createNumber();
        System.out.println("Create New number set");
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("굴림체", Font.PLAIN, 30);
        g.setFont(f);

        for (int i = 0; i < result.length; i++) {
            g.drawString(result[i]+"", 100+(i*50), 100);
        }
            }

    // main
    public static void main(String[] args) {
        new LottoFrame();
    } // end of main
} // end of class
