package thread;

public class WorkerMainTest {
    // main thread
    public static void main(String[] args) {

        // How to use
        System.out.println(" ------------------ main thread start ----------------");
        // 현재 thread 누구인지 알아보는 명령어
        System.out.println(Thread.currentThread());

        // 작업자 하나 생성;
        Worker worker1 = new Worker("Worker1(SubThread)");
        worker1.start(); // Start what you should do

        System.out.println(" ------------------ main thread end ----------------");


    } // end of main
} // end of class
