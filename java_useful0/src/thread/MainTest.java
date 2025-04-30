package thread;

public class MainTest {
    // main thread
    public static void main(String[] args) {
        // Thread?
        // process : 프로그램이 실행되면 OS 로부터 메모리를 할당받아 프로세스 상태가 됨
        // thread  : 하나의 프로세스에는 하나 이상의 thread 를 가지게 되고,
        //           실제 작업을 수행하는 단위는 thread 이다
        //
        // multi threading?
        // 여러 thread 가 동시에 수행되는 프로그래밍,
        // 여러 작업이 동시에 실행되는 효과,
        // thread 는 각각 자신만의 변수, 메서드 등 작업 공간 등을 가짐,

        // 단, multi threading program 시, 주의점!
        // each thread 사이에는 공유하는 자원을 가질수있다
        // 여러 thread 가 자원을 공유하여 작업이 수행되는 경우,
        // 서로 자원을 차지하려는 race condition 발생!
        // .


    } // end of main
} // end of class
