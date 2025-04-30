package _swing;

import javax.swing.*;

/**
 * JLabel 이용해서 이미지
 * JLabel.add(); 메서드 이용, 이미지 겹칠수 있음
 * 좌표 기준으로 배치관리자를 세팅하려면 null 값을 세팅 해야함
 */
public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;

    public MyFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("JLabel 이용한 Image 사용연습");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundIcon = new ImageIcon("images/background.png");
        ImageIcon playerIcon = new ImageIcon("images/player.png");

        backgroundMap = new JLabel(backgroundIcon);
        player = new JLabel(playerIcon);

        backgroundMap.setSize(500, 450);
        backgroundMap.setLocation(0, -20);

        player.setSize(100, 350); // 원본 이미지 크기 조절 불가
        player.setLocation(200, 200);

    } // init

    private void setInitLayout() {
        // 좌표 기반 세팅 = 컴포넌트 크기 지정, xy 좌표 지정 필수!!!
        setLayout(null);

        // 루트 패널에 붙이기
        add(player);
        add(backgroundMap);


        // 맨밑에서 visible 명령어 입력
        setVisible(true);

    } // set

    // test code
    public static void main(String[] args) {
        new MyFrame();
    } // end of main
} // end of class
// 250429.1200.