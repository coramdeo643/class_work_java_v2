package lotto.ch01;

import java.util.Arrays;
import java.util.Random;

/**
 * SRP; Single Responsibility Principle
 * 클래스 설계시 원칙 중 하나
 * : 단일 책임의 원칙(클래스당 하나의 책임씩 가지는 것)
 */
public class LottoRandomNumber {

    final int LOTTO_NUMBER_COUNT = 6;

    public int[] createNumber() {
        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];
        Random random = new Random();
        for (int i = 0; i < lottoWinNum.length; i++) {
            lottoWinNum[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoWinNum[j] == lottoWinNum[i]) {
                    i--;
                } // if
            } // for

        } // for
        Arrays.sort(lottoWinNum);
        return lottoWinNum;
    }

    public static void main(String[] args) {
        LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
        int[] result = lottoRandomNumber.createNumber();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

} // end
