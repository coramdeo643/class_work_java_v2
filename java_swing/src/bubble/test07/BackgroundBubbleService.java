package bubble.test07;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 버블은 계속 쏴야하니까 스레드로 하면 게임이 느려진다,
 * 다른 방법으로 하자
 */
public class BackgroundBubbleService {

    private BufferedImage image;
    private Bubble bubble;

    public BackgroundBubbleService(Bubble bubble) {
        try {
            this.bubble = bubble;
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 왼쪽벽확인
    public boolean leftWall() {
        Color leftColor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY() + 25));
        // Red = 255, 0, 0 --> 왼쪽 벽이라고 판단
        if (leftColor.getRed() == 255 && leftColor.getBlue() == 0 && leftColor.getGreen() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean rightWall() {
        Color rightColor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY() + 25));
        if (rightColor.getRed() == 255 && rightColor.getBlue() == 0 && rightColor.getGreen() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean topWall() {
        Color topColor = new Color(image.getRGB(bubble.getX()+25, bubble.getY()));
        if (topColor.getRed() == 255 && topColor.getBlue() == 0 && topColor.getGreen() == 0) {
            return true;
        } else {
            return false;
        }
    }


}
