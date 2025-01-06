public class ThreadLifecycleDemo implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is Running");

            System.out.println(Thread.currentThread().getName() + " is going to sleep");
            Thread.sleep(1000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " is waiting for Notification");
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " is Resumed and running again");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }

    }

    public static void main(String[] args) {

        ThreadLifecycleDemo runnable = new ThreadLifecycleDemo();
        Thread t1 = new Thread(runnable, "Thread - 1");

        System.out.println(t1.getName() + " is NEW STATE");
        t1.start();
        try {
            Thread.sleep(1000);
            synchronized (runnable) {
                System.out.println(" Main thread is notifying " + t1.getName() + "");
                runnable.notify();
            }
            t1.join();
            System.out.println(t1.getName() + " has terminated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}