package ro.itschool.project.utils.multithreading.thread_creation;

public class ThreadWithLambda {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread with lambda is working."));
        thread.start();
    }
}