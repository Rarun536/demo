class A {
    public A() {
        System.out.println("This is default constructor in A class");
    }

    public A(int a) {
        System.out.println("Parameterized Constructor in A class");
    }
}

class B extends A {
    public B() {
        System.out.println("This is default constructor in B class");
    }

    public B(int a) {
        System.out.println("Parameterized Constructor in B");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B(8);
        B obj1 = new B();

    }
}
