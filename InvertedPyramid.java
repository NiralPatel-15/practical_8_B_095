import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Symbol: ");
        String symbol = sc.next();

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        System.out.println("\nInverted Full Pyramid Pattern:\n");

        for (int i = rows; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Symbols
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(symbol);
            }

            System.out.println();
        }

        sc.close();
    }
}

