import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int count = 0;

        for (int row = 1; row <= n + count + 1; row++) {
            if (row == 1) {
                for (int spaces = 1; spaces <= n + 1; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            }

            if (row > 1 && row != n + count + 1) {
                System.out.println();
                for (int spaces = 1; spaces <= n - 1; spaces++) {
                    System.out.print(" ");
                }

                for (int stars = 1; stars <= row - 1; stars++) {
                    System.out.print("*");
                    if (stars == row - 1) {
                        System.out.print(" |");
                        System.out.print(" ");
                        for (int starsNew = 1; starsNew <= row - 1; starsNew++) {
                            System.out.print("*");
                        }
                    }
                }
                n = n - 1;
                count++;
            }

            if (row == n + count + 1) {
                System.out.println();
                for (int stars = 1; stars <= row - 1; stars++) {
                    System.out.print("*");
                    if (stars == row - 1) {
                        System.out.print(" |");
                        System.out.print(" ");
                        for (int starsNew = 1; starsNew <= row - 1; starsNew++) {
                            System.out.print("*");
                        }
                    }
                }
            }
        }

    }

}
