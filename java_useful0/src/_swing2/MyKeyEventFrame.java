package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyEventFrame extends JFrame implements KeyListener {

    private JTextArea textArea;
    private final int FRAME_SIZE = 300;
    private int x = 100;
    private int y = 100;
    private final int move = 10;
    private JLabel player;

    public MyKeyEventFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        ImageIcon pIcon = new ImageIcon("images/player.png");
        player = new JLabel(pIcon);
        player.setSize(100, 100);
        player.setLocation(x, y);
        textArea = new JTextArea();
        textArea.setSize(50, 50);
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        add(player);
        add(textArea);
        setVisible(true);
    }

    private void addEventListener() {
        textArea.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.setLocation(x, y -= move);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.setLocation(x, y += move);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.setLocation(x -= move, y);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.setLocation(x += move, y);
        }
    }

    // test code
    public static void main(String[] args) {
        MyKeyEventFrame myKeyEventFrame =  new MyKeyEventFrame();
        myKeyEventFrame.textArea.setText("안녕반가워");
    } // end of main
} // end of class
//250429.1700.