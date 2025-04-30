package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 배치관리자 - FlowLayout (컴포넌트들을 수평, 수직으로 배치)
 */
public class MyComponents extends JFrame {

    // member variable
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    // constructor
    public MyComponents() {
        initData();
        setInitLayout();

    }

    private void initData() {
        setTitle("컴포넌트 확인");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button = new JButton("JButton");
        label = new JLabel("글자를 띄우는 컴포넌트");
        textField = new JTextField("아이디 입력하세요", 30);
        passwordField = new JPasswordField("비밀번호 입력하세요", 40);
        checkBox = new JCheckBox("동의");
    }

    private void setInitLayout() {
        // JFrame 의 배치 관리자를 결정해주는 method(레이아웃)
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        // 프레임에 붙여넣기
        add(button);
        add(label);
        add(textField);
        add(passwordField);
        add(checkBox);
    }

    // main, test code
    public static void main(String[] args) {

        MyComponents myComponents = new MyComponents();

    } // end of main


} // end of class
