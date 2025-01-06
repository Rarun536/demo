import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class credentialsDeserialization {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("credentials.txt");
                ObjectInputStream oos = new ObjectInputStream(fis);) {
            credentials c = (credentials) oos.readObject();
            System.out.println(c.getUserId() + ", " + c.getUserName() + ", " + c.getPassword());
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
