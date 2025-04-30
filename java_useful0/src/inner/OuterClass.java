package inner;

//250425.1200.
public class OuterClass {

    private int num = 10;

    // inner class? meaning the class in class
    // 1. member inner class
    class InnerClass {
        public void display() {
            System.out.println("inner class display() call " + num);
        }
    } // end of inner class

    public static void main(String[] args) {
        //InnerClass innerClass = new InnerClass();
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();

    } // end of main


} // end of outer class
