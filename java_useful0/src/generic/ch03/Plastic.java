package generic.ch03;

public class Plastic extends Material{

    @Override
    public void doPrinting() {
        System.out.println("파우더를 사용해서 프린팅...");
    }

    @Override
    public String toString() {
        return "재료는 플라스틱입니다";
    }
} // end of class
