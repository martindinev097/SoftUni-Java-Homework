import java.util.Scanner;

public class SquareFrame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 && col == row) {
                    System.out.print("+ ");
                } else if (col == n && row == 1) {
                    System.out.print("+ ");
                    System.out.println();
                } else if (col > 1 && col < n && row != n){
                    System.out.print("- ");
                }

                if (row > 1 && row != n && (col == 1 || col == n)) {
                    System.out.print("| ");
                }

                if (row > 1 && row != n && col == n) {
                    System.out.println();
                }

                if (row == n && (col == 1 || col == n)) {
                    System.out.print("+ ");
                }
                if (row == n && col > 1 && col < n){
                    System.out.print("- ");
                }
            }
        }

    }

}
