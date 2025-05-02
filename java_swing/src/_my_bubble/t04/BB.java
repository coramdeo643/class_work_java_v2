package _my_bubble.t04;

import javax.swing.*;

public class BB extends JLabel implements Moveable {
    private int x;
    private int y;
    private boolean left;
    private boolean right;
    private boolean up;
    private ImageIcon bubble;
    private Player player;

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public ImageIcon getBubble() {
        return bubble;
    }

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public BB (Player player) {
        this.player = player;
        initData();
        setInitLO();
    }
    private void initData() {
        bubble = new ImageIcon("img/bubble.png");
        left = false;
        right = false;
        up = false;
    }
    private void setInitLO() {
        x=player.getX();
        y=player.getY();
        setIcon(bubble);
        setSize(50,50);
        setLocation(x,y);
    }

    @Override
    public void left() {
        left = true;
        setIcon(bubble);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    setLocation(x -= 1, y);
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

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
} // end of class
