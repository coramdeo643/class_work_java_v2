package bubble.test06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();

        new Thread(new BackgroundPlayerService(player)).start();
    }
    private void initData() {
        setTitle("버블버블게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        // 루트 패널에 JLable 을 넣어보기
        setContentPane(backgroundMap);
        player = new Player();
    }
    private void setInitLayout() {
        setLayout(null); // 좌표기준 (절대 레이아웃)
        setResizable(false); // 리사이즈 조절 막기
        setLocationRelativeTo(null); // JFrame 화면 가운데 배치해줌


        add(player);
        setVisible(true);
    }

    private void addEventListener() {
        // 프레임에 키보드 이벤트 리스너 등록 처리
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            // 키를 누룰때 .. 누르고 있으면 계속 이벤트 발생
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if(player.isLeft() == false && player.isLeftWallCrash() == false) {
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        // 만약 플레이어가 오른쪽 가고 있는 상태가 아니라면 메서드를 수행해!
                        // 만약 플레이어가 오른쪽 가고 있는 상태라면 right() 수행 하지마
                        if(player.isRight() == false && player.isRightWallCrash() == false) {
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if(player.isUp() == false && player.isDown() == false) {
                            player.up();
                        }
                        break;
                }
            }


            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("code : " + e.getKeyCode());
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        // 왼쪽으로 가고 있다면 멈춰(while 종료) -- 스레드 종료 됨
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        // 움직이다가 멈춰 !!!
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        break;
                    case KeyEvent.VK_SPACE:
                        add(new Bubble(player));
                        break;
                }
            }
        });
    }

    // 테스트 코드
    public static void main(String[] args) {
        new BubbleFrame();
    }

}
