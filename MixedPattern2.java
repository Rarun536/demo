import java.util.Scanner;

public class MixedPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number of rows ?");
        int rows = scanner.nextInt();

        System.out.println("Here is your patter: ");
        for(int i = 1; i<= rows; i++) {
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=rows-i+1; k++){
          System.out.print("* ");
        }
    System.out.println();
    }
    for(int i = 2; i<=rows; i++) {
        for (int j=1; j<=rows-i; j++) {
            System.out.print("  ");
        }
        for (int k=1; k<=i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    scanner.close();
}
}