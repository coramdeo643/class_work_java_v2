package _my_test;

//250425.1042.
//inheritance
public class Worker extends Thread {
    private String name;
    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " : " + i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(" = = start = = ");
        System.out.println(Thread.currentThread());
        Worker worker1 = new Worker("SubThread");
        worker1.start();
        System.out.println(" = = E N D = = ");
    }
}
