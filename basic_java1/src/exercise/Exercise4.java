package exercise;

public class Exercise4 {
    public static void main(String[] args) {

        // 💡당신은 전자 상거래 웹사이트를 운영하고 있으며, 특정 제품에 대해 할인 행사를 진행하려고 합니다.
        // 제품의 원래 가격은 59.99달러이고, 30% 할인을 적용하려고 합니다.
        // 최종 가격을 계산한 후, 소수점 이하를 버리고 정수 부분만을 가격으로 표시하려고 합니다.
//
//        1. 제품의 원래 가격과 할인율을 상수로 선언하십시오.
//        2. 할인된 가격을 계산하고, 그 결과를 정수로 형변환하여 최종 가격을 구하십시오.
//        3. 최종 가격을 출력하십시오.
//
//                **할인율 공식 선정하기 (인터넷 검색)**
//
//        1. 할인된 가격 = 원가 − (원가 × 할인율)
//        2. 할인된 가격 = 원가 × (1 − 할인율)
        final double ORIGIN_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30;
        int discountPrice = (int)(ORIGIN_PRICE - (ORIGIN_PRICE * DISCOUNT_RATE));
        System.out.println("Original Price : $" + ORIGIN_PRICE);
        System.out.println("--> Discounted price : $" + discountPrice);

    } // end of main
} // end of class
