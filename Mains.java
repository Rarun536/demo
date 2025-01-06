import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Mains {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aru.txt"))) {
            Main main = (Main) ois.readObject();
            System.out.println("Name: " + main.name + ", Age: " + main.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}