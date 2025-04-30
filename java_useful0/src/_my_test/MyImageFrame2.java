package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame2 extends JFrame {

    private MyImagePanel myImagePanel;


    public MyImageFrame2() {
        init();
        setInit();
    }

    private void init() {
        setTitle("Upload image practice");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myImagePanel = new MyImagePanel();
    }

    private void setInit() {
        add(myImagePanel);
    }

    static class MyImagePanel extends JPanel {
        private Image image1;

        // inner class constructor
        public MyImagePanel() {
            // ImageIcon 데이터 타입을 .getImage() 메서드 호출해서 형변환 > Image
            // ImageIcon(파일명) 파일찾는 기준, 루트폴더 java_useful 아래를 확인함
            image1 = new ImageIcon("image2.png").getImage();
        }

        // 자동으로 호출되게끔 순서가 정해져있음
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 이미지를 올려보자~
            g.drawImage(image1, 0, 0, 200, 200, null);

        }
    } // end of static inner class

    public static void main(String[] args) {
        new MyImageFrame2();
    } // end of main

} // end of class

