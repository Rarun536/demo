import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationSample {
    public static void main(String[] args) {

        StudentSer obj = new StudentSer();

        obj.setStudentId(1907);
        obj.setCollegename("Java Engineering Institute");
        obj.setStudentName("Stringster");
        obj.setUniversityname("World's Java University");

        try (FileOutputStream fos = new FileOutputStream("StudentSer.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(obj);
        } catch (Exception e) {
            System.out.println("Some Error Occured :" + e.getMessage());
        }
    }
}
