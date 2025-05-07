package collections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SimpleTimeZone;

public class HashMapTest {
    public static void main(String[] args) {
        // 계층 구조 확인
        Map<String, String> map;

        // Map 계열 자료 구조 객체 declare + init
        Map<String, String> books = new HashMap<>();

        // C R U D - Data CREATE
        books.put("Harry Porter", "J.K.Rowling");
        books.put("Lord of the Ring", "J.R.R.Tolkien");
        books.put("1984", "George Orwell");

        // 데이터 조회 : 특정 키 값으로 value 읽어보기 - READ
        String value1 = books.get("Harry Porter");
        System.out.println("value1 : " + value1);
        String value2 = books.get("1Harry Porter");
        System.out.println("value2 : " + value2); // 없는 키값 요청 --> null

        // 데이터 수정 - UPDATE
        books.put("1984", "Updated");
        System.out.println(books.get("1984"));

        // 데이터 삭제
        books.remove("Lord of the Ring");
        // size check
        System.out.println("Map size check : " + books.size());
        // 키값을 확인하는 메서드 제공
        System.out.println("ketSet() : " + books.keySet());

        // Enhanced for
        for ( String key : books.keySet()) {
            System.out.println("key 값 check" + (key));
            System.out.println("key 값 check" + books.get(key));
        }

        // Iterator 사용해서 순회시켜보자
        Iterator<Map.Entry<String, String>> iter = books.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println("key : " + entry.getKey() + " + value : " + entry.getValue());
        }

        System.out.println("Map(books)의 크기를 반환 : " + books.size());
        // 전체 요소 삭제
        books.clear();
        System.out.println("Map(books)의 크기를 반환 : " + books.size());

    } // end of main

} // end of class
