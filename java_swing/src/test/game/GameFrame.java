package test.game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {
    private int pX = 300;
    private int pY = 300;
    private int p2X = 200;
    private int p2Y = 200;
    private boolean flag = true;
    private BufferedImage bgImage;
    private BufferedImage p1;
    private BufferedImage sp1;
    private BufferedImage p2;
    private ImagePanel imagePanel;

    public GameFrame() {
        init();set();addEv();
        Thread thread = new Thread(imagePanel);
        thread.start();
    }
    private void init() {
        setSize(500,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            bgImage = ImageIO.read(new File("images/bg.png"));
            p1 = ImageIO.read(new File("images/p1.png"));
            sp1 = ImageIO.read(new File("images/sad_p1.png"));
            p2 = ImageIO.read(new File("images/p11.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
        imagePanel = new ImagePanel();
    }
    private void set(){
        add(imagePanel);
        setVisible(true);
    }
    private void addEv(){
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_UP) {
            pY -=10;
        } else if (c == KeyEvent.VK_DOWN) {
            pY += 10;
        } else if (c == KeyEvent.VK_LEFT) {
            pX -= 10;
        } else if (c == KeyEvent.VK_RIGHT) {
            pX += 10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    private class ImagePanel extends JPanel implements Runnable {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(bgImage,0,0,500,450,null);
            g.drawImage(p1,pX,pY,50,50,null);
            g.drawImage(p2,p2X,p2Y,50,50,null);
        }

        @Override
        public void run() {
            boolean direction = true;
            while (flag) {
                if (direction == true) {
                    p2X += 5;
                } else {
                    p2X -= 5;
                }
                if (p2X >= 400) {
                    direction = false;
                }
                if (p2X <= 100) {
                    direction = true;
                }
                if (pX == p2X && pY == p2Y) {
                    getGraphics().drawImage(sp1,pX,pY,50,50,null);
                    p1=null;
                    p2 = null;

                }
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                repaint();
            }

        }
    }
}
