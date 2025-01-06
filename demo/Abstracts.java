import Car;

package demo;

abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    }

    public abstract void fly();

}

abstract class GWagon extends Car {
    public void drive() {
        System.out.println("Driving.....");
    }
}

class UpdatedGWagon extends GWagon { // CONCRETE CLASS
    public void fly() {
        System.out.println("Flying.....");
    }
}

public class Abstracts {
    public static void main(String[] args) {

        Car obj = new UpdatedGWagon();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
