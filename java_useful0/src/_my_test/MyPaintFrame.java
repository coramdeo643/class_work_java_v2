package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private MyPanel myPanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("MyPaintFrame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitLayout() {
        super.add(myPanel);
    }

    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawLine(150, 50, 90, 110);
            g.drawLine(150, 50, 210, 110);
            g.drawRect(100, 100, 100, 100);
            g.drawRect(160, 120, 20, 20);
            g.drawLine(170, 120, 170, 140);
            g.drawLine(160, 130, 180, 130);
            int[] xPoints = {300, 350, 400, 290, 410, 300};
            int[] yPoints = {300, 200, 300, 230, 230, 300};
            g.drawPolyline(xPoints, yPoints, 6);

            for (int i = 0; i < 30; i++) {
                g.drawLine(i * 10, 5, 150, 50);
            }
            for (int i = 0; i < 11; i++) {
                g.drawRect(10, 250, i * 10, i * 10);
            }
            for (int i = 0; i < 101; i += 10) {
                for (int j = 0; j < 101; j += 10) {
                    g.drawString("*", i + 300, j + 50);
                }
            }

            for (int i = 1; i < 102; i += 20) {
                g.drawArc(200, 200, i, i, 0, 360);
            }


        }
    } // end of static inner class

    public static void main(String[] args) {
        new MyPaintFrame();
    } // end of main
} // end of class
