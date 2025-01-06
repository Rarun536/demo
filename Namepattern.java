public class Namepattern {
    public static void main(String[] args) {
        String name = "ARUN"; // Replace with your name

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { // here if it depends on j value then only the i value chnages and output
                                          // changes
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println(); // Move to the next line after printing the name
        }
    }
}
