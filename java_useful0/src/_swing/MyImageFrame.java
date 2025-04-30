package _swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    private MyImagePanel myImagePanel;


    public MyImageFrame() {
        init();
        setInit();
    }

    private void init() {
        setTitle("Upload image practice");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myImagePanel = new MyImagePanel();
    }

    private void setInit() {
        add(myImagePanel);
    }

    static class MyImagePanel extends JPanel {
        // member variable declare of inner class
        private Image image1;
        private Image image2;
        private Image image3;
        private Image image4;
        // inner class constructor
        public MyImagePanel() {
            // ImageIcon 데이터 타입을 .getImage() 메서드 호출해서 형변환 > Image
            // ImageIcon(파일명) 파일찾는 기준, 루트폴더 java_useful 아래를 확인함
            image1 = new ImageIcon("image2.png").getImage();
            image2 = new ImageIcon("image1.png").getImage();
            image3 = new ImageIcon("i.png").getImage();
            image4 = new ImageIcon("o.png").getImage();
        }

        // 자동으로 호출되게끔 순서가 정해져있음
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 이미지를 올려보자~
            g.drawImage(image1, 0, 0,  200,200, null);
            g.drawImage(image2, 200, 0,  200,200, null);
            g.drawImage(image3, 200, 200,  200,200, null);
            g.drawImage(image4, 0, 200,  200,200, null);

        }
    } // end of static inner class

    public static void main(String[] args) {
        new MyImageFrame();
    } // end of main

} // end of class

