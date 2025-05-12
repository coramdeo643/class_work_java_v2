package bubble.game;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Player extends JLabel implements Moveable {

    private BubbleFrame mContext;

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    private Player player;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 플레이어의 움직인 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;

    // 플레이어 방향 상태 (enum 타입 사용 법 1 - 선언 )
    private PlayerWay playerWay;

    // 나를 생성시켜주는 Bubble Frame 의 주소값을 전달받기

    public Player(BubbleFrame mContext) {
        // *****Context --> 문맥(환경정보)
        this.mContext = mContext;

        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("java_swing/img/playerR.png");
        playerL = new ImageIcon("java_swing/img/playerL.png");
        // 플레이어 초기 상태 설정
        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitLayout() {


        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }


    @Override
    public void left() {
        // 클래스 이름으로 접근한다.
        playerWay = PlayerWay.LEFT;
        left = true;
        setIcon(playerL);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    x = x - SPEED;
                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of while
            } // end of run()
        }).start();
    }

    @Override
    public void right() {
        playerWay = PlayerWay.RIGHT;
        right = true; // 움직임 상태값 변경
        setIcon(playerR);
        // 익명 클래스 - thread.start() ---> run() 메서안에 구문 동작된다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    x = x + SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void up() {
        //System.out.println("점프!");
        up = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 130 / JUMP_SPEED; i++) {
                    y = y - JUMP_SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of for
                up = false; // 상태값을 잘 다루어야 버그가 없다.
                down();
            }
        }).start();


    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (down) {
                    y = y + JUMP_SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // end of while
                down = false; // 상태값을 확실하게 처리하자.
            }
        }).start();

    }

    @Override
    public void attack() {
        // JLabel 부모의 add() 호출
        // add(new Bubble(this));
        // BubbleFrame --> add(new Bubble(this));
        // 1. 콜백 메서드를 직접 설계해서 완성
        // 2. 자식 클래스에서 부모 클래스의 주소값을 전달받아서
        //    부모.기능() 호출 가능
        mContext.add(new Bubble(this));
    }
}
