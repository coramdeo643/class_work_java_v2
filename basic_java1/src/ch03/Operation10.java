package ch03;

public class Operation10 {
    // main entry
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 500;
        //        100 > 500
        //            F        T : F
        //                 500
        int max = (n1 > n2) ? n1 : n2;
        System.out.println("max = " + max);

    } // end of main
} // end of class
