import java.util.Scanner;

public class LeftRightSumAnother {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= 2 * n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (i <= n) {
                sumLeft = sumLeft + number;
            } else {
                sumRight = sumRight + number;
            }
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }

}