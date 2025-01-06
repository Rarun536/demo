class Arun {
    public void display() {
        System.out.println("This method is in class Arun");
    }
}

class Tharun extends Arun {
    public void display() {
        System.out.println("This method is in class Tharun");
    }
}

class Extra extends Arun {
    // public void display() {
    // System.out.println("This method is in class Extra");
    // }
}

public class Polymorphism {
    public static void main(String[] args) {

        Arun obj = new Extra();
        obj.display();

        // obj = new Tharun();
        // obj.display();

        // obj = new Extra();
        // obj.display();
    }
}
