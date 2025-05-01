package bubble.test03;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 현재 main thread 너무 바쁨,
 * background 에서 계속 player 움직임 관찰 예정
 * Demon!
 */
public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;

    // 생성자 의존 주입(DI, dependency Injection)*** = 연관 관계
    public BackgroundPlayerService(Player player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // start() method 호출되면 동작하도록!
    @Override
    public void run() {
        while (true) {
            Color leftColor = new Color(image.getRGB(player.getX()+5,player.getY()+25));
            // 플레이어 좌표에 보정값 추가
            Color rightColor = new Color(image.getRGB(player.getX()+65,player.getY()+25));
            // 플레이어의 좌표값에 따라서 맵 색상 구분 가능
            //System.out.println("L : " + leftColor); System.out.println("R : " + rightColor);

            // 논리적으로 255,0,0 이면 벽 충돌 판단 가능
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                // 빨간색으로 판별 = 왼쪽 벽 접촉 상태 인지
                //System.out.println("left wall touch");
                player.setlWallTouch(true);
                player.setLeft(false);
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                //System.out.println("right wall touch");
                player.setrWallTouch(true);
                player.setRight(false);
            } else {
                player.setrWallTouch(false);
                player.setlWallTouch(false);

            }
            // 위 조건 아니면 흰색, 동작 가능 하도록 처리
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
