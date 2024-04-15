import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scan.nextLine());

            if (numbers > maxValue) {
                maxValue = numbers;
            }

            if (numbers < minValue) {
                minValue = numbers;
            }

        }

        System.out.printf("Max number: %d%nMin number: %d", maxValue, minValue);

    }

}
