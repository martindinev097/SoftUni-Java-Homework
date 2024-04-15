import java.util.Scanner;

public class SquareOfStars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");

                if (col == n) {
                    System.out.println();
                }
            }
        }

    }

}
