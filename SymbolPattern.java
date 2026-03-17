import java.util.Scanner;

public class SymbolPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Symbol: ");
        String symbol = sc.next();

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        System.out.println("\nSymbol Increasing Pattern:\n");

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}


