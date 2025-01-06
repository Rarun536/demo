
class Village {
    static int population = 1000;

    public void peopleCountVillage() {
        System.out.println("People in the Village is :" + Village.population);
    }

    class Ward {
        public void peopleCountWard() {
            System.out.println("People in the Ward1 is :" + Village.population / 4);
        }
    }

}

public class Innerclass {
    public static void main(String[] args) {

        Village obj = new Village();
        obj.peopleCountVillage();

        Village.Ward obj1 = obj.new Ward();
        obj1.peopleCountWard();

    }
}
