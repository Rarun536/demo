class Students {
    int rollnos;
    String names;
    int marks;
}

public class Direct {
    public static void main(String[] args) {
        Students st1 = new Students();
        Students st2 = new Students();
        Students st3 = new Students();

        st1.rollnos = 100;
        st1.names = "Arunreddy";
        st1.marks = 88;

        st2.rollnos = 101;
        st2.names = "Arkehs";
        st2.marks = 78;

        st3.rollnos = 102;
        st3.names = "shrekar";
        st3.marks = 98;

        Students studs[] = new Students[3];
        studs[0] = st1;
        studs[1] = st2;
        studs[2] = st3;

        for (Students stu : studs) {
            System.out.println(stu.names + " : " + stu.marks + " , " + stu.rollnos + " ");
        }
    }
}
