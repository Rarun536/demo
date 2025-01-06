interface ElectronicDevices {
    void oldRadio();

    void oldTv();
}

interface A {
    void colourTvs();

}

interface X extends A {
    void mobilePhones(); // we cannot call the interfaces directly instead class implements interface and
                         // then using interface as reference and obj creating to the class we call
                         // methods in interface.
}

class B implements ElectronicDevices, X {

    public void mobilePhones() {
        System.out.println("Mobiles designed in B class");
    }

    public void cdPlayers() {
        System.out.println("Cd players designed in B class");
    }

    public void oldRadio() {
        System.out.println("oldRadios are designed in 70s in class B");
    }

    public void oldTv() {
        System.out.println("oldTvs used to be black and white picture in class B");
    }

    public void colourTvs() {
        System.out.println("Pictures in colourTvs are colorful in class B");
    }

}

public class inteface2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        ElectronicDevices obj = new B();
        obj.oldRadio();
        obj.oldTv();
        System.out.println("--------------------------------------------------");
        X obj2 = new B();
        obj2.mobilePhones();
        obj2.colourTvs();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        B obj1 = new B();
        obj1.cdPlayers();
        obj1.oldRadio();
        obj1.colourTvs();
        obj1.oldTv();
        obj1.mobilePhones();

    }
}
