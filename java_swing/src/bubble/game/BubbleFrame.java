package bubble.game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {
    // 명시적으로
    BubbleFrame mContext = this; // 자기 자신의 주소값을 담는다

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
        backgroundMap = new JLabel(new ImageIcon("java_swing/img/backgroundMap.png"));
        // 루트 패널에 JLabel 을 넣어보기
        setContentPane(backgroundMap);
        player = new Player(mContext);
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
                        if(!player.isLeft() && !player.isLeftWallCrash()) {
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        // 만약 플레이어가 오른쪽 가고 있는 상태가 아니라면 메서드를 수행해!
                        // 만약 플레이어가 오른쪽 가고 있는 상태라면 right() 수행 하지마
                        if(!player.isRight() && !player.isRightWallCrash()) {
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if(!player.isUp() && !player.isDown()) {
                            player.up();
                        }
                        break;
                }
            }


            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("code : " + e.getKeyCode());
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
                        player.attack();
                        //add(new Bubble(player));
                        break;
                }
            }
        });
    }

    // 테스트 코드
    public static void main(String[] args) {
        // BubbleFrame(하위에 생성되는 모든 객체들의 주소값에 접근가능)
        // main 함수를 가질수있는 클래스는 Context 라는 개념 생성 가능
        new BubbleFrame();
    }

}
