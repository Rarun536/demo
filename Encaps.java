class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("Constructor method");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encaps {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(22, "Krishu");
        // obj.setAge(24);
        // obj.setName("Rikwesh");

        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
