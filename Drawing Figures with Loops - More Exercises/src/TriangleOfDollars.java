import java.util.Scanner;

public class TriangleOfDollars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int r = 0;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("$ ");
                if (col == row) {
                    System.out.println();
                }
            }
        }

    }

}