package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPanelEx1 extends JFrame {

    private JButton button1;
    private JButton button2;
    // 컴포넌트들을 그룹화 시키기
    // 즉, 각각의 배치관리자를 추가로 설정해서 관리가능
    private JPanel panel1;
    private JPanel panel2;

    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;

    public MyPanelEx1() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("패널연습");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel1 = new JPanel();
        panel2 = new JPanel();

        button1 = new JButton("button1");
        button2 = new JButton("button2");

        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));

        panel1.setBackground(new Color(173, 216, 230));
        panel2.setBackground(new Color(230, 230, 150));
        add(panel1);
        add(panel2);

        // 패널 1에 버튼1 붙이기
        // panel 1 배치관리자 설정 아직 안함 = 기본 배치관리자 세팅
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        panel1.add(button1);
        panel1.add(checkBox1);
        panel1.add(checkBox2);
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 50));
        panel2.add(button2);
        panel2.add(checkBox3);
        panel2.add(checkBox4);


    }

    public static void main(String[] args) {
        new MyPanelEx1();

    }

} // end of class
