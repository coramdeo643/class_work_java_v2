package ch07;
// Rule. 모든 자바 코드는 클래스라는 영역 안에서 작성됨
public class FishBreadMainTest {
    // main entry
    public static void main(String[] args) {

        // 지역변수
        int a = 10;

        // new keyword + class name + ();
        // = instantiation to Heap area = upload to memory
        new FishBread();
        // get address of the class
        FishBread f1 = new FishBread();
        FishBread f2 = new FishBread();
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        f1.price = 500;
        f2.price = 1000;
        System.out.println("f1.price = " + f1.price);
        System.out.println(f2.price);


    } // end of main

} // end of class
