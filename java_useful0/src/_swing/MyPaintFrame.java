package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    // 변수, 생성자, 메서드, 내부 클래스 선언가능~
    //private JPanel panel; = 이 패널도 클래스, 내가 정의한 클래스에 상속가능

    private MyDrawPanel drawPanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("InnerClass JPanel inheritance");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawPanel = new MyDrawPanel();
    }

    private void setInitLayout() {
        super.add(drawPanel);
    }

    // 우리가 정의할 정적 내부 클래스
    static class MyDrawPanel extends JPanel {

        // paint 철자 확인!
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(50, 50, 100, 50);
            g.drawLine(50,50, 200, 200);
            g.draw3DRect(60,60,30,30,true);
            g.drawString("***",500,500);
            g.drawString("\uD83D\uDE0E",310,310);
        }

    } // end of inner class

    public static void main(String[] args) {
        new MyPaintFrame();
    }

}
