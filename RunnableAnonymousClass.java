public class RunnableAnonymousClass {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 15; i++) {
                    System.out.println("Welcome to the world of Java :" + i);

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Error message :" + e.getMessage());
                    }
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 15; i++) {
                    System.out.println("Hello U :" + i);

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Error message :" + e.getMessage());
                    }
                }
            }
        });

        t.start();
        t1.start();
    }
}
