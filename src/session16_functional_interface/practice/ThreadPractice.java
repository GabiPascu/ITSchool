package session16_functional_interface.practice;

public class ThreadPractice {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a separated thread");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
