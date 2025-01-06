interface Computer {
    void code();
}

// class Laptop implements Computer {
// public void code() {

// System.out.println("code , compile and runs");
// }

// }

// class Desktop implements Computer {
// public void code() {

// System.out.println("Faster code , compile and runs");
// }
// }

class Developer implements Computer {
    public void devApp() {

        System.out.println("This class method implements devApp");
    }

    public void code() {
        System.out.println("this method called in Developer class");
    }
}

public class Intface {
    public static void main(String[] args) {
        System.out.println("=======================================================================================");
        // Type 1 using Anonymous class we can call the method
        Computer obj = new Computer() {

            public void code() {
                System.out
                        .println("Code method defined in Interface Computer and now calling using the ANONYMOUS class");
            }

        };
        obj.code();
        System.err.println(
                "=========================================================================================================");
        // The usual class implement interface type method.
        Developer obj1 = new Developer();
        obj1.code();
        obj1.devApp();
        System.out.println(
                "=================================================================================================");

    }
}
