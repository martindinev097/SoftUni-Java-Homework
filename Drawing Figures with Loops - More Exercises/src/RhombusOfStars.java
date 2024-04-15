import java.util.Scanner;

public class RhombusOfStars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int spaceCount = 0;
        int spaceCountBelow = 1;

        for (int row = 1; row <= n; row++) {
            if (row < n) {
                if (row == 1) {
                    for (int spaces = 1; spaces < n; spaces++) {
                        spaceCount++;
                        System.out.print(" ");
                    }
                }
                if (row > 1) {
                    for (int space = 1; space < spaceCount; space++) {
                        System.out.print(" ");
                    }
                    spaceCount--;
                }
            }
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("* ");
            }

            System.out.println();
        }

            System.out.print(" ");

        for (int newRow = 1; newRow < n; newRow++) {
            if (newRow > 1) {
                spaceCountBelow++;
                for (int newSpace = 1; newSpace <= spaceCountBelow; newSpace++) {
                    System.out.print(" ");
                }
            }

            for (int newStars = newRow; newStars < n; newStars++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

}