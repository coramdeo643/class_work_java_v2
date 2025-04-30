package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    private int playerX = 500;
    private int playerY = 250;
    private int player2X = 300;
    private int player2Y = 250;

    private boolean flag = true;

    private BufferedImage backgroundImage;
    private BufferedImage player1;
    private BufferedImage player2;
    private ImagePanel imagePanel;

    public GameFrame() {
        init();
        set();
        addEvent();
        // main 작업자가 서브 작업자를 생성
        Thread thread1 = new Thread(imagePanel);
        thread1.start();
    }

    private void init() {
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            backgroundImage = ImageIO.read(new File("images/bg.png"));
            player1 = ImageIO.read(new File("images/p1.png"));
            player2 = ImageIO.read(new File("images/p3.png"));
        } catch (IOException e) {
            e.printStackTrace(); // 오류 추적
        }
        imagePanel = new ImagePanel();
    }

    private void set() {
        add(imagePanel);
        setVisible(true);
    }

    private void addEvent() {
        // JFrame 자체에 키 이벤트 리스너를 등록
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            playerY -= 10;
        } else if (code == KeyEvent.VK_DOWN) {
            playerY += 10;
        } else if (code == KeyEvent.VK_LEFT) {
            playerX -= 10;
        } else if (code == KeyEvent.VK_RIGHT) {
            playerX += 10;
        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("keyCode : " + e.getKeyCode());
    }

    // inner class construct
    private class ImagePanel extends JPanel implements Runnable {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 800, null);
            g.drawImage(player1, playerX, playerY, 50, 50, null);
            g.drawImage(player2, player2X, player2Y, 70, 70, null);
        }

        @Override
        public void run() {

            // direction true 오른쪽 상태
            // direction false 왼쪽 상태
            boolean direction = true;
            // 서브 작업자가 해야하는 일을 명시하도록 약속
            while (flag) {
                if (direction == true) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }
                if (player2X >= 800) {
                    direction = false;
                }
                if (player2X <= 100) {
                    direction = true;
                }
                if ((playerX >= player2X && playerX <= player2X + 30) && (playerY >= player2Y && playerY <= player2Y + 70)) {
                    player1 = null;
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                repaint(); // 새로고침

            }
        }
    } // end of inner class
} // end of class
