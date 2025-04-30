package thread;

/**
 * Thread making
 * 상속을 활용해서 thread 만들어보자(작업자 만들어보기)
 */
// 240425,0945
public class Worker extends Thread {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    // 서브 작업자가 해야할 일은 run() method 안에 재정의 해주어야한다.
    // 약속된 부분 ! start() method 통해서 쓰레드한테 일을 시작해라고 명령 하달
    // 그러면 다른 쓰레드가 run() 안에 있는 부분을 수행!
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("worker " + name + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                System.out.println("외부에서 신호를 받아서 예외가 발생!");
                e1.printStackTrace(); // 예외가 발생한 부분들을 좀더 상세히 출력해!(추적)
            }

        } // end of for

    }


}
