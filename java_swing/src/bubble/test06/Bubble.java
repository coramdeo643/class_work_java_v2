package bubble.test06;

import javax.swing.*;

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

    private Player player;

    @Override
    public int getX() {
        return x;
    }
    @Override
    public int getY() {
        return y;
    }
    public boolean isLeft() {
        return left;
    }
    public boolean isRight() {
        return right;
    }
    public boolean isUp() {
        return up;
    }
    public boolean isLftWallTouch() {
        return lftWallTouch;
    }
    public boolean isRtWallTouch() {
        return rtWallTouch;
    }
    public ImageIcon getBubble() {
        return bubble;
    }
    public Player getPlayer() {
        return player;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setLeft(boolean left) {
        this.left = left;
    }
    public void setRight(boolean right) {
        this.right = right;
    }
    public void setUp(boolean up) {
        this.up = up;
    }
    public void setLftWallTouch(boolean lftWallTouch) {
        this.lftWallTouch = lftWallTouch;
    }
    public void setRtWallTouch(boolean rtWallTouch) {
        this.rtWallTouch = rtWallTouch;
    }
    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    // 생성자를 통해서 Player 객체의 주소값을 주입받기 -> 생성자 의존 주입
    public Bubble (Player player) {
        this.player = player;
        init();
        setInitLO();
        // bubble is enough for one thread
        bubbleStartThread();
    }

    private void bubbleStartThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(player.getPlayerWay() == PlayerWay.LEFT) {
                    left();
                } else {
                    right();
                }
            }
        }).start();
    }

    private void init(){
        bubble = new ImageIcon("img/bubble.png");
        left = false;
        right = false;
        up = false;
    }
    private void setInitLO(){
        x=player.getX(); // get player location
        y=player.getY();
        setIcon(bubble);
        setSize(50,50);
        setLocation(x,y);
    }

    @Override
    public void left() {
        left = true;
        for (int i = 0; i < 400; i++) {
            x--;
            setLocation(x,y);
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
            setLocation(x,y);
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
        up=true;
        while(true) {
            y--;
            setLocation(x,y);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // t-c
        }
    }
} // end of class
