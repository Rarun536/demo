import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationSample {

    public static void main(String[] args) {

        try (FileInputStream obj = new FileInputStream("StudentSer.txt");
                ObjectInputStream oos = new ObjectInputStream(obj);) {
            StudentSer st = (StudentSer) oos.readObject();
            System.out.println(st.getStudentId() + ", " + st.getStudentName() + ", " + st.getCollegename() + ", "
                    + st.getUniversityname());
        } catch (Exception e) {
            System.out.println("Some Error Occured :" + e.getMessage());
        }
    }
}