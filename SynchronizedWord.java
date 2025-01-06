class Helper {
    public synchronized static void helping(String message) {

        try {
            Thread.sleep(5000);
            System.out.println("Giving help");
            Thread.sleep(5000);
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class SynchronizedWord {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Need Help");
                Helper.helping("Help reached");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Stopped Helping");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        t2.start();

    }

}
