package generic.ch02;

/**
 * Let's Use Generic Programming
 * 문법 : 클래스, 데이터 타입, 메서드 등에서 <T> 대체 문자열을 선언가능
 */

public class GenericPrinter<T> {

    // T(type) 라는 대체 문자 사용, E(element) / K(key) / V(value) (사실 아무 문자나 사용가능)
    // 자료형 매개변수(type parameter)
    // 이 클래스는 사용하는 시점에 실제 사용될 자료형이 결정이 된다.

    T material; // T 대체 문자형으로 변수를 선언할수있음

    // get + set
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
