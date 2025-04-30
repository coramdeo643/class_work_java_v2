package ch07;

// code side executing
public class StudentMainTest1 {
    // main entry
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = 1;
        s1.studentName = "Teemo";
        s1.address = "green hill";

        Student s2 = new Student();
        s2.studentId = 2;
        s2.studentName = "Shaco";
        s2.address = "red hill";


        // 객체에 동작을 시켜보자
        s1.showInfo();
        s2.showInfo();
        System.out.println("-------------------------------");
        s1.study();
        s2.study();
        System.out.println("-------------------------------");
        s1.breakTime();
        s2.breakTime();
        System.out.println("-------------------------------");
        // method test
        s1.takeExam();
        s2.takeExam();
        System.out.println("-------------------------------");
        s1.cleaning();
        s2.cleaning();
        System.out.println("-------------------------------");


    } // end of main
} // end of class
