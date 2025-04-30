package _swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    // 화면 관련 작업 display, layout
    // -- 배치관리자
    // --- 컴포넌트 component

    // 멤버 변수 member variable
    JButton[] buttons;
    String[] directions = {BorderLayout.NORTH, BorderLayout.SOUTH,
            BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER};


    // 생성자 constructor
    public BorderLayoutEx() {
        setTitle("borderLayout연습");
        setSize(300, 300);
        setVisible(true); // 화면에 보이게
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X(exit) 버튼 활성화
        initData();
        setInitLayout();
    }

    // method
    private void initData() { // init = initiation
        buttons = new JButton[5]; // 0,1,2,3,4
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
    }

    private void setInitLayout() {
        // 배치 관리자(border layout)
        // BorderLayout = 컴포넌트들을 동서남북가운데로 배치시켜주는 레이아웃
        setLayout(new BorderLayout());

        // 프레임(패널)
        // 우리가 생성한 JButton 객체를 프레임에 붙임

        for (int i = 0; i < 5; i++) {
            add(buttons[i], directions[i]);
        }
    }

} // end of class
