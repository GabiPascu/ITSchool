package ro.itschool.project.utils.multithreading.thread_creation;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("My runnable is running.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}