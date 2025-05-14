package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class SimpleLogDataFormatting {
    public static void main(String[] args) {
        // 직접 포맷팅된 날짜를 출력해보기
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("a hh시 mm분");
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");

        System.out.println("format1 = " + now.format(format1));
        System.out.println("format2 = " + now.format(format2));
        System.out.println("format3 = " + now.format(format3));
        System.out.println("format4 = " + now.format(format4));
        System.out.println("format5 = " + now.format(format5));
        System.out.println("format6 = " + now.format(format6));

        DateTimeFormatter format7 = DateTimeFormatter.ofPattern("a", Locale.JAPAN);
        System.out.println("now.format(format7) = " + now.format(format7));
    }
}
