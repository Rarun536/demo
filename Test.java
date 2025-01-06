interface Arun {

    String place = "Hyderabad"; // final and static in interface
    String State = "Telangana";

    void displayInfo();

    void exhibits();
}

class Tharun implements Arun {

    public void displayInfo() {
        System.out.println("Displaying info : Arun" + " : " + Arun.place);
    }

    public void exhibits() {
        System.out.println("Exhibiting .... : Arun" + " : " + Arun.State);
    }

}

public class Test {

    public static void main(String[] args) {
        Arun obj = new Tharun();
        obj.exhibits();
        obj.displayInfo();

        // System.out.println(Arun.State + " : " + Arun.place);
    }
}
