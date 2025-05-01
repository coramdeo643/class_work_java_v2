package bubble.test01;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerRDie;
    private ImageIcon playerL;
    private ImageIcon playerLDie;

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerRDie = new ImageIcon("img/playerRDie.png");
        playerL = new ImageIcon("img/playerL.png");
        playerLDie = new ImageIcon("img/playerLDie.png");
    }

    private void setInitLayout() {
        x = 55;
        y = 535;
        setSize(50,50);
        setIcon(playerR);
        setLocation(x,y);

    }

    @Override
    public void left() {
        System.out.println("player left() method call");
    }

    @Override
    public void right() {
        System.out.println("player right() method call");
    }

    @Override
    public void up() {
        System.out.println("player up() method call");
    }

    @Override
    public void down() {

    }
}
