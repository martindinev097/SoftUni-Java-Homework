import java.util.Scanner;

public class Sunglasses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                for (int stars = 1; stars <= 2 * n; stars++) {
                    System.out.print("*");
                }
                for (int spaces = 1; spaces <= n; spaces++) {
                    System.out.print(" ");
                }
                for (int stars = 1; stars <= 2 * n; stars++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            if (row > 1 && row != n) {
                System.out.print("*");
                for (int tilt = 1; tilt <= 2 * n - 2; tilt++) {
                    System.out.print("/");
                }
                System.out.print("*");
                if (row != (n - 1) / 2 + 1) {
                    for (int spaces = 1; spaces <= n; spaces++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int tilt = 1; tilt <= 2 * n - 2; tilt++) {
                        System.out.print("/");
                    }
                    System.out.print("*");
                }
                if (row == (n - 1) / 2 + 1) {
                    for (int line = 1; line <= n; line++) {
                        System.out.print("|");
                    }
                    System.out.print("*");
                    for (int tilt = 1; tilt <= 2 * n - 2; tilt++) {
                        System.out.print("/");
                    }
                    System.out.print("*");
                } else {
                    for (int spaces = 1; spaces <= n; spaces++) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            if (row == n) {
                for (int stars = 1; stars <= 2 * n; stars++) {
                    System.out.print("*");
                }
                for (int spaces = 1; spaces <= n; spaces++) {
                    System.out.print(" ");
                }
                for (int stars = 1; stars <= 2 * n; stars++) {
                    System.out.print("*");
                }
            }

        }

    }

}
