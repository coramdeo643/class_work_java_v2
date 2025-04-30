package com.swing;

import javax.swing.*;
import java.awt.*;

// GUI 화면을 만들어보자
// 화면 구성 배치관리자(layout)
// button 라벨, 텍스트 - Component
public class FlowLayoutEx extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    // 생성자
    public FlowLayoutEx() {
        super.setTitle("배치관리자연습 - FlowLayout");
        super.setSize(500, 500);
        super.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 생성자 안에서 다른 메서드를 호출가능
        initData();
        setInitLayout();
    }

    public void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("버튼3");
    }

    public void setInitLayout() {
        // 배치관리자 중... FlowLayout, BorderLayout, null(좌표기반, (0,0) 왼쪽위)
        // FlowLayout --> 컴포넌트(버튼)들을 수평, 수직으로 배치하는 객체
        super.setLayout(new FlowLayout());
        // add 컴포넌트를 패널에 붙이다
        super.add(button1);
        super.add(button2);
        super.add(button3);
    }

    public static void main(String[] args) {
        FlowLayoutEx flowLayoutEx = new FlowLayoutEx();
    } // end of main


} // end of class
