package time;

import java.time.LocalDate;

public class After100Days {
    public static void main(String[] args) {
        // 현재 날짜로부터 100일 후의 날짜 계산 및 출력
        LocalDate today = LocalDate.now();
        LocalDate after100Days = today.plusDays(100);
        System.out.println("After 100 Days = " + after100Days);
    }
}
