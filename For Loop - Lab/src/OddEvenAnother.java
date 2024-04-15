import java.util.Scanner;

public class OddEvenAnother {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0) {
                sumEven = sumEven + number;
            } else {
                sumOdd = sumOdd + number;
            }

        }

        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumEven - sumOdd));
        }

    }

}
