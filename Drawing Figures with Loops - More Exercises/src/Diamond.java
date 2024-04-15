import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int countDash = 1;
        int newCount = 1;

        for (int row = 1; row <= n; row++) {
            if (n % 2 != 0) {
                if (row == 1) {
                    for (int dash = 1; dash <= (n - 1) / 2; dash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int dash = 1; dash <= (n - 1) / 2; dash++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
                if (row > 1 && row <= n / 2 + 1) {
                    for (int dash = 1; dash <= (n - 1) / 2 - countDash; dash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int middleDash = 1; middleDash <= newCount; middleDash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int dash = 1; dash <= (n - 1) / 2 - countDash; dash++) {
                        System.out.print("-");
                    }
                    countDash++;
                    newCount += 2;
                    if (row == n / 2 + 1) {
                        countDash = 1;
                        newCount = newCount - 4;
                    }
                    System.out.println();
                }
                if (row > n / 2 + 1 && row <= n) {
                    for (int dash = 1; dash <= countDash; dash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int middleDash = 1; middleDash <= newCount; middleDash++) {
                        System.out.print("-");
                    }
                    if (row < n) {
                        for (int stars = 1; stars <= n - (n - 1); stars++) {
                            System.out.print("*");
                        }
                    }
                    for (int dash = 1; dash <= countDash; dash++) {
                        System.out.print("-");
                    }
                    newCount -= 2;
                    countDash += 1;
                    System.out.println();
                }
            } else {
                if (row == 1) {
                    for (int dash = 1; dash <= (n - 2) / 2; dash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= 2; stars++) {
                        System.out.print("*");
                    }
                    for (int dash = 1; dash <= (n - 2) / 2; dash++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
                if (row > 1 && row <= n / 2) {
                    for (int dash = 1; dash <= n / 2 - countDash - 1; dash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int middleDash = 1; middleDash <= newCount + 1; middleDash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int dash = 1; dash <= n / 2 - countDash - 1; dash++) {
                        System.out.print("-");
                    }
                    countDash++;
                    newCount += 2;
                    if (row == n / 2) {
                        countDash = 1;
                        newCount = n - 2;
                    }
                    System.out.println();
                }
                if (row > n / 2 && row <= n - 1) {
                    for (int dash = 1; dash <= countDash; dash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int middleDash = 1; middleDash <= newCount - 2; middleDash++) {
                        System.out.print("-");
                    }
                    for (int stars = 1; stars <= n - (n - 1); stars++) {
                        System.out.print("*");
                    }
                    for (int dash = 1; dash <= countDash; dash++) {
                        System.out.print("-");
                    }
                    countDash++;
                    newCount -= 2;
                    System.out.println();
                }
            }
        }

    }
}