package ch03;

/**
 * 논리 연산자 복습
 */
public class Operation6 {
    // main entry
    public static void main(String[] args) {

        // 쇼핑몰 회원 정보 설정
        int userAge = 20; // 사용자 나이
        int cartTotal = 50_000; // 장바구니 총액(원) 정수 숫자 단위에 _ 사용가능
        boolean isMember = true; // 회원 여부
        int couponCount = 2; // 보유 쿠폰 갯수

        // 1. 무료 배송 조건 : 장바구니 총액 3만원 이상 + 회원이어야함
        boolean freeShipping = (cartTotal >= 30_000) && (isMember);
        System.out.println("무료배송 가능 여부 : " + freeShipping);
        
        // 2. 할인 조건 : 나이가 19세 이상이거나 쿠폰이 1개 이상 있어야함
        boolean canDiscount = (userAge >= 19) || (couponCount > 0);
        System.out.println("할인가능여부 = " + canDiscount);

        // 3. 구매제한조건 : 나이가 19세 미만 이고 회원이 아닌 경우
        boolean purchaseIsRestricted = (userAge < 19) && (!isMember);
        System.out.println("구매제한여부 = " + purchaseIsRestricted);

        // 4. 이벤트 참여조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개 미만 참여가능
        boolean canJoinEvent = (cartTotal < 50_000) || (couponCount < 3);
        System.out.println("이벤트참여가능여부 = " + canJoinEvent);

        // 직접 문제를 만들고 식 세워서 출력
        int temp = 1;
        boolean isRaining = true;
        // 우산과 패딩 챙겨야하나?
        boolean coldAndRain = (temp < 5) && (isRaining);
        System.out.println("우산과 패딩 챙겨야해? = " + coldAndRain);


    } // end of main
} // end of class