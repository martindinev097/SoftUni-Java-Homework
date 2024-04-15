import java.util.Scanner;

public class RectangleOfNxNStars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("*");
                if (column == n) {
                    System.out.println();
                }
            }
        }

    }

}
