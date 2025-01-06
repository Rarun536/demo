
interface A {
    void hello();
}

enum Week implements A {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    Week() {
        System.out.println("Constructor called for " + this);
    }

    public void hello() {
        System.out.println("Hey how are you");
    }
}

public class enumsexample {

    public static void main(String[] args) {
        Week week;

        week = Week.Monday;
        week.hello();

    }
}