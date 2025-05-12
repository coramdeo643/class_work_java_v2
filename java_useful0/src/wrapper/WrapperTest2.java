package wrapper;

public class WrapperTest2 {
    public static void main(String[] args) {
        // 도전문제
        // double DT --> wrapper
        double n1 = 3.14159;
        Double n2 = Double.valueOf(n1);
        System.out.println("n2 = " + n2);

        Double n3 = Double.valueOf(123.456);
        double n4 = n3.doubleValue();
        System.out.println("n4 = " + n4);

        Double autoWrapped = 9.123456;
        double autoUnwrapped = autoWrapped;
        System.out.println("autoUnwrapped = " + autoUnwrapped);

        Character c1 = 'C';
        char c2 = c1;
        Character c3 = c2;
        System.out.println("c3 = " + c3);

        Boolean b1 = true;
        boolean b2 = b1;
        Boolean b3 = b2;
        System.out.println("b3 = " + b3);

        double d1 = 234.234;
        Double dd1 = d1;
        System.out.println("dd1 = " + dd1);
    } // end of main
} // end of class
