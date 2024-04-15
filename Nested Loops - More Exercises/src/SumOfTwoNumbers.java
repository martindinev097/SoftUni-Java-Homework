import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                sum = i + j;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", count, magicNumber);

    }

}
