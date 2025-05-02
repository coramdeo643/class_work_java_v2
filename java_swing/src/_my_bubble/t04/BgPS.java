package _my_bubble.t03;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BgPS implements Runnable {

    private BufferedImage image;
    private Player player;

    public BgPS(Player player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } //

    @Override
    public void run() {
        while (true) {
            Color lColor = new Color(image.getRGB(player.getX() + 5, player.getY() + 25));
            Color rColor = new Color(image.getRGB(player.getX() + 65, player.getY() + 25));
            Color uColor = new Color(image.getRGB(player.getX(),player.getY()));
            if (lColor.getRed() == 255 && lColor.getBlue() == 0 && lColor.getGreen() == 0) {
                player.setlWallTouch(true);
                player.setLeft(false);
            } else if (rColor.getRed() == 255 && rColor.getBlue() == 0 && rColor.getGreen() == 0) {
                player.setrWallTouch(true);
                player.setRight(false);
            } else if (uColor.getBlue() == 255 && uColor.getRed() == 0 && uColor.getGreen() ==0) {
                player.setuBottom((true));
            } else {
                player.setlWallTouch(false);
                player.setrWallTouch(false);
            } // if
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // try
        }//while
    } // run
} // class
