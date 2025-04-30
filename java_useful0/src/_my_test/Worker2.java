package _my_test;

//250425.1042.
//implement
public class Worker2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " \t");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    // test code
    public static void main(String[] args) {
        Worker2 worker2 = new Worker2();
        Thread subT1 = new Thread(worker2);
        subT1.start();
    }
}
