package _my_test;

import javax.swing.*;
import java.awt.*;

public class Image101 extends JFrame {
    private Image202 imagepanel;

    public Image101() {
        init();
        setInit();
    }

    private void init() {
        setTitle("Title");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagepanel = new Image202();
        setVisible(true);
    }

    private void setInit() {

    }

    static class Image202 extends JPanel {
        private Image i1;

        public Image202() {
            i1 = new ImageIcon("i.png").getImage();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(i1, 0, 0, 300, 300, null);
        }
    }

    public static void main(String[] args) {
        new Image101();
    }
}
