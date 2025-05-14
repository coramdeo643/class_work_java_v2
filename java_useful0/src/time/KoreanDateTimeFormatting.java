package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KoreanDateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        // 한국식 포맷을 정의(예 : 2025년05월14일12시00분)
        // 사용자 정의 패턴 지정 가능
        // 패턴 설명 : yyyy, MM, dd, HH(24h), mm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");
        // now.format(formatter);
        // 사용자 정의 포맷으로 현재 시간 출력 가능
        System.out.println("지금은, " + now.format(formatter));
        System.out.println("지금은, " + now);

    }
}
