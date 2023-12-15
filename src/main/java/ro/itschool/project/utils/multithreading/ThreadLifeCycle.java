package ro.itschool.project.utils.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadLifeCycle extends Thread {

    @Override
    public void run() {

        try {
            log.info("The thread is running and going to sleep for 2 seconds.");
            Thread.sleep(2000);
            log.info("Thread is not sleeping anymore.");
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle thread = new ThreadLifeCycle();
        log.info("Thread state after creation: " + thread.getState());

        thread.start();
        log.info("Thread state after it was created: " + thread.getState());

        Thread.sleep(2000);
        log.info("Thread state after going to sleep: " + thread.getState());
    }
}