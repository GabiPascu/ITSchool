package ro.itschool.project.utils.multithreading.thread_creation;

public class MyAnonymousClass {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class.");
            }
        });
        thread.start();
    }
}
