package lotto.ch01;

import java.util.Arrays;
import java.util.Random;

public class Copy {

    final int COUNT = 6;
    public int[] createNum() {
        int[] lottoNum = new int[COUNT];
        Random rand = new Random();
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = rand.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNum[j] == lottoNum[i]) {
                    i--;
                }
            }
        }
        Arrays.sort(lottoNum);
        return lottoNum;
    }

    public static void main(String[] args) {
        Copy copy = new Copy();
        int[] r = copy.createNum();
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }

}
