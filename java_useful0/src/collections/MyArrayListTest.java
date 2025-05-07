package collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {

    public static void main(String[] args) {

        List mList; // 리스트 인터페이스(계열)

        // int[] arrayInt = new int[10];
        ArrayList<Integer> list = new ArrayList();
        // <T> <- 제네릭
        // Integer(참조 DT), int(기본 DT)
        // Integer = wrap class, like int DT as class

        // ArrayList<Integer> list -> 정수값을 하나의 변수에 저장하는 리스트 계열의 자료구조 생성.

        // 1. 값을 추가하는 방법?
        // arrayInt[0] = 100;
        list.add(100);
        list.add(null); // [100][null]
        list.add(200);
        list.add(300);

        // 2. 값 출력 방법? 꺼내기
        // System.out.println(arrayInt[0]);
        System.out.println(list.get(0));

        // 3. 값 삭제?
        list.remove(1);
        // 3.1. 삭제 후 전체 출력
        System.out.println(list.toString());

        // 4. 값 인덱스 번호로 지정해서 값 추가(삽입)
        list.add(1, 1000);
        System.out.println("list : " + list);
        // 삭제 처리해야함
        list.remove(2);
        System.out.println("list : " + list);

        // 5. 전체 삭제
        list.clear();
        System.out.println("list : " + list);

        // 6. 리스트의 사이즈를 확인
        System.out.println("사이즈확인 : "+ list.size());

        System.out.println("______________________________");
        // nums 참조 변수에 list 참조 변수의 주소값을 대입.
        System.out.println("list : " + list);
        // 주소값을 복사 > 얕은 복사 개념
        ArrayList nums = list;
        System.out.println("새로 선언한 nums 에 값을 추가");
        nums.add(10);
        nums.add(500);
        // nums 라는 변수로 접근해서 add() 했는데
        // 왜 다시 list 출력하면 데이터가 존재?
        System.out.println("list : " + list);
        System.out.println("nums : " + nums);

        System.out.println("list value check : " + nums.contains(10));
        System.out.println("list element location check : " + nums.indexOf(500));

        for (int i = 0; i < nums.size(); i++) {
            // nums[i] --> array
            System.out.println(nums.get(i));
        }

    } // end of main

} // end of class
