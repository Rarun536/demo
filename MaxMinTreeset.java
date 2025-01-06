import java.util.TreeSet;

public class MaxMinTreeset {
    public static void main(String[] args) {

        TreeSet<Integer> list = new TreeSet<>();

        list.add(76);
        list.add(23);
        list.add(12);
        list.add(98);
        list.add(43);
        list.add(99);
        list.add(87);
        list.add(99);

        int max = list.last();
        int min = list.first();

        System.out.println("Original arraylist is  :" + list);
        System.out.println("Maximum of the list is :" + max);
        System.out.println("Minimum of the list is :" + min);

    }
}
