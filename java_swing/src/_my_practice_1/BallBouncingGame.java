package _my_practice_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class BallBouncingGame extends JFrame implements KeyListener, Runnable {

    private int paddleX;
    private int PADDLE_Y; // Y 위치는 고정
    private final int PADDLE_WIDTH = 80; // 막대 너비 약간 증가
    private final int PADDLE_HEIGHT = 15; // 막대 높이 약간 증가
    private int ballX;
    private int ballY;
    private int ballXDir;
    private int ballYDir;
    private final int BALL_SIZE = 25; // 공 크기 약간 증가
    private boolean isRunning = true;
    private final int MOVE_SPEED = 25; // 이동 속도 약간 증가

    public BallBouncingGame() {
        setTitle("공 튕기기 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500); // 화면 크기 500x500으로 변경
        PADDLE_Y = getHeight() - 50; // 막대 Y 위치를 화면 아래쪽으로 조정
        paddleX = getWidth() / 2 - PADDLE_WIDTH / 2; // 초기 막대 위치 중앙으로 조정
        setFocusable(true);
        addKeyListener(this);

        // 초기 공 위치 및 방향 설정
        Random random = new Random();
        ballX = getWidth() / 2 - BALL_SIZE / 2;
        ballY = getHeight() - 100; // 초기 공 위치를 막대 약간 위로 조정
        ballXDir = (random.nextBoolean() ? 1 : -1); // 초기 x 방향 랜덤하게 설정
        ballYDir = -1; // 처음에는 위로 이동

        new Thread(this).start(); // 게임 루프 시작

        setVisible(true); // 프레임이 모두 설정된 후 보이도록 함
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // 배경색 설정 (화면이 안 보이는 문제 방지)
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // 막대 그리기
        g.setColor(Color.GREEN);
        g.fillRect(paddleX, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT);

        // 공 그리기
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            paddleX -= MOVE_SPEED;
            if (paddleX < 0) {
                paddleX = 0;
            }
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            paddleX += MOVE_SPEED;
            if (paddleX > getWidth() - PADDLE_WIDTH) {
                paddleX = getWidth() - PADDLE_WIDTH;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 사용 안 함
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 사용 안 함
    }

    @Override
    public void run() {
        while (isRunning) {
            // 공 이동
            ballX += ballXDir;
            ballY += ballYDir;

            // 벽 충돌 처리
            if (ballX <= 0) {
                ballXDir = 1; // 오른쪽으로 방향 전환
            } else if (ballX >= getWidth() - BALL_SIZE) {
                ballXDir = -1; // 왼쪽으로 방향 전환
            }

            if (ballY <= 0) {
                ballYDir = 1; // 아래로 방향 전환
            } else if (ballY > getHeight()) {
                // 공이 아래로 벗어나면 게임 종료
                isRunning = false;
                JOptionPane.showMessageDialog(this, "게임 오버!", "결과", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            // 막대와 공 충돌 처리 (공의 아랫부분이 막대의 윗부분에 닿았을 때)
            if (ballY + BALL_SIZE >= PADDLE_Y && ballY < PADDLE_Y + PADDLE_HEIGHT &&
                    ballX + BALL_SIZE > paddleX && ballX < paddleX + PADDLE_WIDTH) {
                ballYDir = -1; // 위로 튕기기
            }

            repaint(); // 화면 다시 그리기

            try {
                Thread.sleep(30); // 게임 속도 조절 (밀리초)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BallBouncingGame());
    }
}