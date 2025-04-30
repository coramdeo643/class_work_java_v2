package lotto.ch03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LottoFrame extends JFrame implements ActionListener {
    // 수정이 될만한 것들은 변수/상수로 등록
    // 2번 이상 반복되면 변수/상수로 등록
    private static final String INITIAL_MESSAGE = "로또 번호 생성!";
    private static final String FONT_NAME = "굴림체";
    private static final int FONT_SIZE = 20;
    private static final int HOW_MANY_LOTTO = 5;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private boolean isInitialState = true; // 초기 상태 플래그
    private int[] currentNumbers;

    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("Lotto Game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Game Start");
        lottoRandomNumber = new LottoRandomNumber();
        currentNumbers = new int[LottoRandomNumber.LOTTO_NUMBER_COUNT];
    }

    private void setInitLayout() {
        add(button, BorderLayout.NORTH);
        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        isInitialState = false;
        currentNumbers = lottoRandomNumber.createNumber();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font(FONT_NAME, Font.PLAIN, FONT_SIZE));
        if (isInitialState) {
            g.drawString(INITIAL_MESSAGE, 230, 200);
        } else {
//            for (int i = 0; i < currentNumbers.length; i++) {
//                g.drawString(currentNumbers[i]+"", 150+(i*50), 200);
//            }
            for (int i = 0; i < HOW_MANY_LOTTO; i++) {
                g.drawString(Arrays.toString(lottoRandomNumber.createNumber()), 200, 220+(i*20));
            }
        }
    }

    // main
    public static void main(String[] args) {
        new LottoFrame();
    } // end of main
} // end of class
