package generic.ch03;

/**
 * Material 상속받은 자식 클래스만 대체 문자열에 들어갈수있음
 */
public class GenericPrinter<T extends Material> {
    T material;

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
