
import java.util.HashSet;
import java.util.Set;

public class ArraySetDemo {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(32);
        nums.add(12);
        nums.add(98);
        nums.add(34);
        nums.add(56);

        System.out.println(nums);

    }
}
