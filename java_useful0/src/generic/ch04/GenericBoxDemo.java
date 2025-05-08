package generic.ch04;

public class GenericBoxDemo {

    public static void main(String[] args) {
//        Toy toy1 = new Toy();
//        Box<Toy> box1 = new Box<>(toy1);
//        box1.setItem(toy1);
//        System.out.println(toy1.toString());

        // Integer 타입 Box 선언 및 사용

        Box<Integer> integerBox = new Box<>(100);
        System.out.println("integerBox = " + integerBox);

        // String 타입 Box 선언 및 사용

        Box<String> stringBox = new Box<>("Fluffy doll");
        System.out.println("stringBox = " + stringBox);

        // double --> Wrapper class --> Double 타입 Box 선언 및 사용

        Box<Double> doubleBox = new Box<>(3.14159);
        System.out.println("doubleBox = " + doubleBox.getItem());
    }
}
