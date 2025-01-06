abstract class A {
    public abstract void show();
}

public class Demoo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Show method NEW"); // multiple methods can be created
            }

        };
        obj.show();
    }
}
