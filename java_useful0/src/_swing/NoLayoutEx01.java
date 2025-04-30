package _swing;

import javax.swing.*;

/**
 * 배치관리자
 * - 설정을 아무것도 안하면
 * 또는 null 값 세팅하면
 * 좌표기준으로 배치가능
 */
public class NoLayoutEx01 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public NoLayoutEx01() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("좌표값으로 버튼 배치하기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
    }

    private void setInitLayout() {
        // 좌표값으로 배치 (반드시 null 값을 입력)
        setLayout(null);

        // 좌표값을 선택하게되면 먼저 컴포넌트에 사이즈를 결정해주어야함
        // setSize(setter)
        button1.setSize(101, 101);
        button2.setSize(100, 50);
        button3.setSize(100, 50);

        // 배치관리자가 좌표값이기 때문에 x, y값을 지정해줘야함
        button1.setLocation(0, 0);
        button2.setLocation(300, 100);
        button3.setLocation(0, 150);

        // 패널에 붙이기
        add(button1);
        add(button2);
        add(button3);


    }

    public static void main(String[] args) {
        new NoLayoutEx01();
    }

} // end of class
