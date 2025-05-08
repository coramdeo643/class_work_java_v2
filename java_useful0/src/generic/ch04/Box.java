package generic.ch04;

/**
 * 제네릭 클래스 Box 설계
 */
public class Box<T> {

    // 변수 선언
    T item;
    // 생성자 선언
    public Box(T item) {
        this.item = item;
    }
    // 내용물 설정(set method)
    public void setItem(T item) {
        this.item = item;
    }
    // 내용물 반환(get method)
    public T getItem() {
        return item;
    }
    // 내용물 출력

}

class Toy {
    @Override
    public String toString() {
        return "This is Toy";
    }
}