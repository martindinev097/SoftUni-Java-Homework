import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int a = 0;

        double oddSum = 0;
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.MAX_VALUE;

        double evenSum = 0;
        double evenMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());

            if (i % 2 != 0) {

                oddSum += number;

                if (number > oddMax) {
                    oddMax = number;
                }

                if (number < oddMin) {
                    oddMin = number;
                }

            } else {

                evenSum += number;


                if (number > evenMax) {
                    evenMax = number;
                }

                if (number < evenMin) {
                    evenMin = number;
                }

            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (n == 0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (n <= 1) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}