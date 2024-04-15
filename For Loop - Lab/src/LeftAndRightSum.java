import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0) {
                sum2 = sum2 + number;
            } else {
                sum1 = sum1 + number;
            }

        }

        if (sum1 == sum2) {
            System.out.printf("Yes%nSum = %d", sum1);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum1 - sum2));
        }

    }

}