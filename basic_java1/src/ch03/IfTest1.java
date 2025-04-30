package ch03;

public class IfTest1 {
    // entry
    public static void main(String[] args) {
        
        // if
        boolean flag = !(true);
        if (flag) {
            // 수행문
            System.out.println("조건식이 true 면 실행");
        }
        System.out.println("코드가 여기까지 내려옴");
        // 단독 if 구문 == 수행문 실행 될수도있고 안될수도있고
        
    } // end of main
} // end of class

