package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        // Duration is to calculate the time gap
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(11,30);
        Duration duration = Duration.between(start, end);
        System.out.println("소요 시간(분) = " + duration.toMinutes() + " mins");
        System.out.println("소요 시간(초) = " + duration.toSeconds() + " secs");
        
    }
}
