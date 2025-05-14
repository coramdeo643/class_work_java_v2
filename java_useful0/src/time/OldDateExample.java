package time;

import java.util.Calendar;
import java.util.Date;

public class OldDateExample {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("현재 시간 : " + now);

        // 직접 new 못하게 막아둠
        // Calendar cal = new Calendar() {]
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,14); // May = 4(Jan = 0)
        System.out.println("Set date : " + cal.getTime());

    } // end of main
} // end of class
