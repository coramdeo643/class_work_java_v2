package bubble.game;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 현재 메인 쓰레드는 너무 바쁜 상태이다.
 * 백그라운드에서 계속 Player 에 움직을 관찰한 예정
 */
public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;

    // 생성자 의존 주입 (DI) - (연관관계)
    public BackgroundPlayerService(Player player) {
        // Player - 직접 생성
        this.player = player;
        try {
            image = ImageIO.read(new File("java_swing/img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // start() 메서드가 호출 되면 동작 하도록 약속 되어 있다.
    @Override
    public void run() {
        while (true) {
            // RGB
            // R - 0 ~ 255, G - 0 ~ 255, B 0 ~ 255;
            Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25 ));
            // 플레이어 좌표에 보정 값 추가
            Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));

            // 바닥 감지 기능 개발
            // 하얀색 (255, 255, 255, 255) 는 --> image.getRGB() --> 16진수 정수값을 반환 - 1 하얀색
            int bottomColorLeft = image.getRGB(player.getX() + 20 , player.getY() + 55  );
            //System.out.println("bottomColorLeft : " + bottomColorLeft);
            int bottomColorRight = image.getRGB(player.getX() + 50, player.getY() + 55);

            if(bottomColorLeft + bottomColorRight != -2) {
                // 여기서 멈추어야 한다. (바닥이야)
                // -1 이라면 바닥으로 떨어져야 하고 -1 아니라면 멈추어야 한다.
                // 멈추는 경우에 수는 (빨간색, 파란샥 이거나)
                player.setDown(false);
            } else {
                // 쪼~끔 점프하는 순간 bottomColor 값이 -1 , -1 (-2) 되기 때문에
                // 바로 player.down() 메서드가 호출 되어 버린다.
                if(player.isUp() == false && player.isDown() == false) {
                    player.down();
                }
            }


            // 플레이어의 좌표 값에 따라서 빨간색, 파란색, 하얀색을 구분할 수 있다.
            // System.out.println("왼쪽 확인 : " + leftColor);
            // System.out.println("오른쪽 확인 : " + rightColor);
            // leftColor - 논리적로 255, 0, 0 이면 왼쪽벽에 충돌함으로 판단.
            // rightColor - 논리적로 255, 0, 0 이면 오른쪽 벽에 충돌함으로 판단.
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                // 빨간색으로 판별 --> 왼쪽벽에 충돌 상태이다.
                //System.out.println("왼쪽벽에 충돌");
                player.setLeftWallCrash(true);
                player.setLeft(false); // 왼쪽 이동 쓰레드 종료
            } else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0 ) {
                // 빨간색으로 판별 --> 오른쪽에 충돌 상태이다.
                //System.out.println("오른쪽벽에 충돌");
                player.setRight(false); // 오른쪽 이동 쓰레드 종료
                player.setRightWallCrash(true);
            } else {
                player.setLeftWallCrash(false);
                player.setRightWallCrash(false);
            }

            // 위 두 조건이 아니면 하얀색.. 즉 마음대로 움직일 수 있다.
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
