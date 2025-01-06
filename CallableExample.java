import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class sample implements Callable<Integer> {
    public Integer call() {
        Integer sum = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello Java World :" + i);
            sum += i;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error occured :" + e.getMessage());
            }
        }
        return sum;

    }
}

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> f = es.submit(new sample());
            System.out.println("Result of the Callable :" + f.get());
        } catch (Exception e) {
            System.out.println("Error occured :" + e.getMessage());
        }
    }
}
