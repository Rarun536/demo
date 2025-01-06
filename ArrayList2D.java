import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(scanner.nextInt());
            }

        }
        System.out.println(list);
        scanner.close();
    }
}
