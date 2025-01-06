import java.io.*;

class Main implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Main(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeDeserializeTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aru.txt"))) {
            Main main = new Main("Arun", 25);
            oos.writeObject(main);
            System.out.println("Object serialized!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
