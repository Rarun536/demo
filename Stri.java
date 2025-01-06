public class Stri {
    public static void main(String[] args) {

        String s1 = "Arun"; // stored in SCP
        String s2 = "Arun";
        String s3 = new String("Arun"); // memory heap are
        String s4 = new String("Arun");
        String s5 = new String("Hello");
        String s6 = new String("Hai");
        System.out.println(s1.equals(s3));
        boolean b = false;
        // In strings == will compare address of the objects, but not objects
        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s2 == s3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s3 == s4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s4 == s5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s5 == s6) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}