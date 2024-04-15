import java.util.Scanner;

public class Profit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int oneLev = Integer.parseInt(scan.nextLine());
        int twoLev = Integer.parseInt(scan.nextLine());
        int fiveLev = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= oneLev; i++) {
            for (int j = 0; j <= twoLev; j++) {
                for (int k = 0; k <= fiveLev; k++) {
                    int totalSum = i + j * 2 + k * 5;

                    if (totalSum == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, totalSum);
                    }

                }
            }
        }

    }

}
