class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        double r1 = obj.add(143.23, 123);
        int r2 = obj.add(1, 2);
        System.out.println(r1);
        System.out.println(r2);
    }
}
