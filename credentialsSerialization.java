import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class credentialsSerialization {
    public static void main(String[] args) {
        credentials obj = new credentials();

        obj.setUserId("199");
        obj.setUserName("Arun1907");
        obj.setPassword("@Arun1999");

        try (FileOutputStream fos = new FileOutputStream("credentials.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(obj);
        } catch (Exception e) {
            System.out.println("Some Error Occured :" + e.getMessage());
        }
    }
}
