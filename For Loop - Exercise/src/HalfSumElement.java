import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum = sum + number;

            if (maxValue < number) {
                maxValue = number;
            }

        }
        int sumWithoutMaxNum = sum - maxValue;

        if (maxValue == sumWithoutMaxNum) {
            System.out.printf("Yes%nSum = %d", maxValue);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxValue - sumWithoutMaxNum));
        }
    }

}
