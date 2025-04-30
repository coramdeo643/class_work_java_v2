package thread;

// 250425.1021.
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print(i + " \t");

            try {
                Thread.sleep(500); // 0.5 sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
