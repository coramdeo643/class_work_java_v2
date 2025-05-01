package _my_bubble.t03;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        init();
        setInitLayout();
        addEventListener();

        new Thread (new BgPS(player)).start();
    }
    private void init() {
        setTitle("Bubble Bobble Game");
        setSize(1000,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        // 루트 패널에 JLabel 넣기
        setContentPane(backgroundMap);

        player = new Player();
    }
    private void setInitLayout() {
        setLayout(null); // 좌표기준(absolute layout = 절대 레이아웃)
        setResizable(false); // 창크기조절 금지
        setLocationRelativeTo(null); // JFrame 화면 가운데 배치

        add(player); // public class Player "extends JLabel"
        setVisible(true);
    }
    private void addEventListener() {
        this.addKeyListener(new KeyListener() { // 프레임에 키보드 이벤트 리스너 등록
            @Override
            public void keyTyped(KeyEvent e) {            }
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("key : " + e.getKeyCode());
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (player.isLeft() == false && player.islWallTouch() == false) { // 오른쪽으로 가고 있으면 left 수행, 아니면 break
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (player.isRight() == false && player.isrWallTouch() == false) { // 왼쪽으로 가고 있으면 right 수행, 아니면 break
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (player.isUp() == false) {
                            player.up();
                        }
                        break;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        player.setUp(false);
                        player.setDown(false);
                        break;
                }
            }
        });
    }
    // test code
    public static void main(String[] args) {
        new BubbleFrame();
    } // end of main
} // end of class
