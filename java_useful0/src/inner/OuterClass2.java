package inner;

/**
 * Local Inner Class(class in Method)
 */
//250425.1400.
public class OuterClass2 {

    public void display() {

        // Local inner class declare
        class LocalInnerClass {
            void printMessage() {
                System.out.println("Hi! I am local inner class method!");
            }
        }

        // LocalInnerClass
        LocalInnerClass inner = new LocalInnerClass();
        inner.printMessage();

    } // end of method-display

    public static void main(String[] args) {

        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display();


    } // end of main
} // end of class
