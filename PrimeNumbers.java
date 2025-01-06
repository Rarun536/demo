public class PrimeNumbers {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static Boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
