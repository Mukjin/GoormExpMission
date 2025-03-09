package java_middle.threads;


public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("스레드 1");
        MyThread thread2 = new MyThread("스레드 2");

        thread1.start();
        thread2.start();
    }
}
