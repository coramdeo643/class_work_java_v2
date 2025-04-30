package inner;

/**
 * Anonymous inner class ( no name )
 */
public class OuterClass3 {

    // Runnable runnable; // interface
    // Interface 기본적으로 인스턴스화 할수없다
    // 하지만, 익명 내부 클래스로 구현가능

    public OuterClass3() {
        // 1. 구현부를 만들어준다
        // 2. 추상메서드를 구현메서드로 변경해준다

        new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    public static void main(String[] args) {

        // 익명 클래스란, 이름이 없는 클래스,
        new OuterClass3(); // = Anonymous class

    }
}
