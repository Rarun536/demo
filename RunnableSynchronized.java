class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello World :" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void execute() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello World :" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableSynchronized {
    public static void main(String[] args) {

        A obj = new A();

        Thread t = new Thread(obj);
        t.start();
    }
}
