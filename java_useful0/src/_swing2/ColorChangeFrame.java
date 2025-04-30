package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 자바는 단일 상속만을 지원함(Object 제외)
 * 이벤트 리스너 예제 코드 작성해보기
 */

// ActionListener(interface) -->
public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton button1;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
    }

    private void setInitLayout() {
        setLayout(new FlowLayout());
        add(button1);
        setVisible(true);
    }

    private void addEventListener() {

    }

    // test code
    public static void main(String[] args) {
        new ColorChangeFrame();
    } // end of main


    //  운영체계와 약속되어있는 추상 메서드를 오버라이드 함
    // 이벤트가 발생되면 이 메서드를 자동으로 수행하여(콜백) 미리 정해져 있는
    // 정보(객쳬)를 받을수있다
    // 단, 어떤 컴포넌트가 이벤트를 실행
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed() 메서지가 호출");
        System.out.println((e.toString()));
    }
} // end of class
