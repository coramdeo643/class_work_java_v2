package exercise;

import java.util.Scanner;

public class Exercise8 {
    // entry
    public static void main(String[] args) {

        // C R U D
        // Create, Read, Update, Delete
//        메뉴 선택
//        1.등록 2.조회 3.수정 4.삭제 0.종료
//        선택: 1
//        등록을 선택했습니다.
//        ------------------------------------------
//        메뉴 선택
//        1.등록 2.조회 3.수정 4.삭제 0.종료
//        선택: 5
//        잘못된 입력입니다. 다시 선택해주세요.
//        ------------------------------------------
//        메뉴 선택
//        1.등록 2.조회 3.수정 4.삭제 0.종료
//        선택: 0
//        프로그램을 종료합니다.
//        ------------------------------------------
        /**
         * ### 요구 조건
         * - 사용자에게 다음 옵션을 보여주고 선택하도록 요청합니다
         *     “1.등록 2.조회 3.수정 4.삭제 0.종료”
         * - 사용자가 옵션 번호를 입력하면, 해당 옵션에 대한 메시지를 출력합니다. 예를 들어, 사용자가 '1'을 선택하면 "등록을 선택했습니다."라고 출력합니다.
         * - 사용자가 '0'을 선택하면 "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료합니다.
         * - 사용자가 유효하지 않은 번호를 입력하면 "잘못된 입력입니다. 다시 선택해주세요."라고 안내하고 다시 메뉴 선택을 할 수 있도록 합니다.
         */

        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("메뉴 선택");
            System.out.println("1. 등록 2. 조회 3. 수정 4. 삭제 0. 종료");
            System.out.print("선택 : ");
            a = sc.nextInt();
            if (a == 1) {
                System.out.println("등록을 선택했습니다.");
            } else if (a == 2) {
                System.out.println("조회를 선택했습니다.");
            } else if (a == 3) {
                System.out.println("수정을 선택했습니다.");
            } else if (a == 4) {
                System.out.println("삭제를 선택했습니다.");
            } else if (a == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println("-----------------------------------------------");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            } // end of if
            System.out.println("-----------------------------------------------");
        } // end of while

    } // end of main

} // end of class
