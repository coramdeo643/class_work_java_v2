package thread;

public class Worker2MainTest {
    // main thread
    public static void main(String[] args) {

        // using inheritance, use start()
        // Worker worker1 = new Worker("Worker1");
        // worker1.start();

        // using interface implement, use start()
        Worker2 worker2 = new Worker2();
        // interface 사용시, start() method 없어서 실제 동작 못시킴
        // worker2.start();
        Thread subT1 = new Thread(worker2);
        subT1.start();

    } // end of main
} // end of class
