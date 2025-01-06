class Calci {
    public void performDivision(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        System.out.println("Result:" + (a / b));
    }

    public void calculate() throws ArithmeticException {
        performDivision(10, 0);
    }
}

public class Calculation {
    public static void main(String[] args) {
        Calci calci = new Calci();
        try {
            calci.calculate();
        } catch (ArithmeticException e) {
            System.out.println("Error in Calculation:" + e.getMessage());
        }
    }
}
