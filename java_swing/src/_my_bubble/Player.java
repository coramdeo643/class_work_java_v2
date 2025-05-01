package _my_bubble;

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

    public void setLeft(boolean left) {
        this.left = left;
    }
    public void setRight(boolean right) {
        this.right = right;
    }
    public void setUp(boolean up) {
        this.up = up;
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
        setSize(50,50);
        setIcon(playerR);
        setLocation(x,y);
    }

    @Override
    public void left() {
        left=true;
        setIcon(playerL);
        //System.out.println("player left() method call");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left && x > 55) {
                    setLocation(x-=SPEED,y);
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
    public void right() {
        right=true; // moving status modified
        setIcon(playerR);
        // anonymous class - thread.start() - run() 구문 동작
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right && x < 880 ) {
                    setLocation(x+=SPEED,y);
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
                for (int i = 0; (i < (130 / JUMP_SPEED)); i++) {
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
        }).start();    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (130 / JUMP_SPEED); i++) {
                    setLocation(x,y+=JUMP_SPEED);
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
