package bubble.game;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Setter
@Getter
public class Bubble extends JLabel implements Moveable {

    private int x;
    private int y;
    // bubble moving
    private boolean left;
    private boolean right;
    private boolean up;

    private boolean isL;
    private boolean isR;


    private boolean lftWallTouch;
    private boolean rtWallTouch;

    private ImageIcon bubble; // BASIC BUBBLE
    private ImageIcon bomb; // popped BUBBLE

    private Player player;
    private BackgroundBubbleService backgroundBubbleService;

    // 생성자를 통해서 Player 객체의 주소값을 주입받기 -> 생성자 의존 주입
    public Bubble(Player player) {
        this.player = player;
        this.backgroundBubbleService = new BackgroundBubbleService(this);
        init();
        setInitLO();
        // bubble is enough for one thread
        bubbleStartThread();
    }

    private void bubbleStartThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (player.getPlayerWay() == PlayerWay.LEFT) {
                    left();
                } else {
                    right();
                }
            }
        }).start();
    }

    private void init() {
        bubble = new ImageIcon("java_swing/img/bubble.png");
        bomb = new ImageIcon("java_swing/img/bomb.png");
        left = false;
        right = false;
        up = false;
    }

    private void setInitLO() {
        x = player.getX(); // get player location
        y = player.getY();
        setIcon(bubble);
        setSize(50, 50);
        setLocation(x, y);
    }

    @Override
    public void left() {
        left = true;
        for (int i = 0; i < 400; i++) {
            x--;
            setLocation(x, y);
            if (backgroundBubbleService.leftWall() == true) {
                // left wall
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // t-c
        }// for
        up();
    }

    @Override
    public void right() {
        right = true;
        for (int i = 0; i < 400; i++) {
            x++;
            // 좌표 오른쪽으로 1 움직였는데 오른쪽벽인지 아닌지 매번 확인후 벽이면 거기서 올라감
            setLocation(x, y);
            if (backgroundBubbleService.rightWall() == true) {
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // t-c
        }// for
        up();
    }

    @Override
    public void up() {
        up = true;
        while (true) {
            y--;
            setLocation(x, y);
            if (backgroundBubbleService.topWall()) {

                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // t-c
        }
        try {
            Thread.sleep(1000);
            setIcon(bomb);
            Thread.sleep(500);
            setIcon(null);
            //TODO null 말고 다른것으로 수정 예정?
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void attack() {
        new Bubble(player);

    }
} // end of class
