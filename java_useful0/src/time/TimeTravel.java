package time;

import java.time.LocalDate; // Only for the date
import java.time.LocalDateTime; // For the date and time

public class TimeTravel {
    public static void main(String[] args) {
        // 현재 날짜를 가져옴
        LocalDate today = LocalDate.now();
        System.out.println("Date today : " + today);

        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Time now : " + now);


    } //
} //
