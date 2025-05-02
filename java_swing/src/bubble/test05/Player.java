package bubble.test04;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerRDie;
    private ImageIcon playerL;
    private ImageIcon playerLDie;

    // player speed status
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // player moving status
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // wall touch status
    private boolean lWallTouch;
    private boolean rWallTouch;

    // Alt+Insert Getter Setter
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerRDie() {
        return playerRDie;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public ImageIcon getPlayerLDie() {
        return playerLDie;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMP_SPEED() {
        return JUMP_SPEED;
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

    public boolean isDown() {
        return down;
    }

    public boolean islWallTouch() {
        return lWallTouch;
    }

    public boolean isrWallTouch() {
        return rWallTouch;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerRDie(ImageIcon playerRDie) {
        this.playerRDie = playerRDie;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

    public void setPlayerLDie(ImageIcon playerLDie) {
        this.playerLDie = playerLDie;
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

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setlWallTouch(boolean lWallTouch) {
        this.lWallTouch = lWallTouch;
    }

    public void setrWallTouch(boolean rWallTouch) {
        this.rWallTouch = rWallTouch;
    }

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerRDie = new ImageIcon("img/playerRDie.png");
        playerL = new ImageIcon("img/playerL.png");
        playerLDie = new ImageIcon("img/playerLDie.png");
        // player initial location status
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
        left = true;
        setIcon(playerL);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    setLocation(x -= SPEED, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // while
            } // run()
        }).start();

    }

    @Override
    public void right() {
        right = true; // moving status modified
        setIcon(playerR);
        // anonymous class - thread.start() - run() 구문 동작
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    setLocation(x += SPEED, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start(); // 객체 생성후 바로 start
        //System.out.println("player right() method call");
        //setLocation(x+=10,y);
    }

    @Override
    public void up() {
        up = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (130 / JUMP_SPEED); i++) {
                    setLocation(x, y -= JUMP_SPEED);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } // for
                up = false;
                down();
            } // run()
        }).start();
    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (130 / JUMP_SPEED); i++) {
                    setLocation(x, y += JUMP_SPEED);
                    try {
                        Thread.sleep(4);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                down = false;
            }
        }).start();

    }
}
