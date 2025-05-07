package collections;

import java.util.*;

public class MySetTest {

    public static void main(String[] args) {

        // 계층 구조 확인 (업캐스팅된 상태)
        Set<Integer> mTestSet = new HashSet<>();

        // 사용방법

        // HashSet : 중복된 요소를 허용하지 않고, 순서가 없는 자료 구조
        HashSet<Integer> numberSet = new HashSet<>();

        // 요소 추가하기
        numberSet.add(500);
        numberSet.add(11);
        numberSet.add(200);
        numberSet.add(333);
        numberSet.add(553);
        System.out.println("numberSet size : " + numberSet.size());
        System.out.println("numberSet = " + numberSet);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        // 요소 제거
        numberSet.remove(1); // remove, 없는 obj 선택해도 오류발생 X

        System.out.println("numberSet size : " + numberSet.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        // 자료구조는 반복문과 함께 많이 사용됨
        // for (int i = 0; i < 10; i++) { } - 인덱스 for 구문 사용 불가!
        // enhanced for
        for (Integer num : numberSet) {
            System.out.println("num 값 확인 : " + num);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        // Set 계열을 Iterator 타입으로 변환해서 순회가능
        Iterator<Integer> iter = numberSet.iterator(); // 형변환처리 Set --> Iterator Conversion
        while (iter.hasNext()) {
            System.out.println("값 : " + iter.next()); // next() 요소를 반환처리한다
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
        // Set 계열 자료 구조 선언(정수값만 담을수 있고 중복 허용 불가)
        HashSet<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(getRandomNumber());
        }
        System.out.println("Random Lotto Numbers : " + lottoNumbers.toString());

        // HashSet DT --> ArrayList 객체 생성시,
        // 즉 생성자에 인자값으로 넣을수 있도록 설계되어있음
        ArrayList<Integer> sortedList = new ArrayList<>(lottoNumbers);
        // 정렬하기 기능 사용해보기
        Collections.sort(sortedList);
        System.out.println("Sorted Lotto Numbers : " + sortedList);

    } // end of main

    // 무작위 1부터 45까지 랜덤 번호 생성 함수
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }


} // end of class
