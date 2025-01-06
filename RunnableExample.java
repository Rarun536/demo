class A implements Runnable {

    public void run() {
        // System.out.println("This is run method in class A :");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello Class A :" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Error occured :" + e.getMessage());
            }
        }
    }
}

class B implements Runnable {

    public void run() {
        // System.out.println("This is run method in class A :");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello Class B :" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Error occured :" + e.getMessage());
            }
        }

    }
}

public class RunnableExample {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
