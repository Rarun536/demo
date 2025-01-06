import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(21);
        nums.add(20);
        nums.add(109);
        nums.add(34);
        nums.add(78);

        // nums.add(0, 65); // adding element to the index 0
        nums.remove(0);

        System.out.println(nums);

    }
}
