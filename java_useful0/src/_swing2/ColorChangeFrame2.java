package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public ColorChangeFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("Black");
        button2 = new JButton("Pink");
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());

        panel.setBackground(Color.darkGray);
        add(panel, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setVisible(true);
    }

    // 이 메서드의 책임은 이벤트 리스너만을 등록 처리 한다.
    private void addEventListener() {
        button1.addActionListener(this);
        button2.addActionListener(this);
    }


    // 이벤트 리스너 콜백 메서드
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton)e.getSource();
        System.out.println(selectedButton.getText());
        // 같은 객체의 주소값을 가리키는 비교
        if(selectedButton == button1) {
            panel.setBackground(Color.BLACK);
        } else if (selectedButton == button2){
            panel.setBackground(Color.pink);
        }

        if (selectedButton.getText().equals(button1.getText())) {

        } else if (selectedButton.getText().equals(button2.getText())) {

        }

    }

    // main
    public static void main(String[] args) {
        new ColorChangeFrame2();
    }// end of main
} // end of class
