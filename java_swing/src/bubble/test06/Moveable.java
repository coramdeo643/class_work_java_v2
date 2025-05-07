package bubble.test05;

// player move interface
public interface Moveable {
    // public abstract 생략가능
    void left();
    void right();
    void up();
    default void down() {}
    // 인터페이스의 모든 메서드는 추상메서드!
    // 단, default method 제외
    // default void a() {}
}
