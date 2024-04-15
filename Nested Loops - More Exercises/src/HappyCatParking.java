import java.util.Scanner;

public class HappyCatParking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hoursPerDay = Integer.parseInt(scan.nextLine());

        double sum = 0;
        double totalSum = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            sum = 0;
            for (int currentHour = 1; currentHour <= hoursPerDay; currentHour++) {
                if (currentDay % 2 != 0) {
                    if (currentHour % 2 == 0) {
                        sum += 1.25;
                        totalSum += 1.25;
                    } else {
                        sum += 1;
                        totalSum += 1;
                    }
                } else {
                    if (currentHour % 2 != 0) {
                        sum += 2.5;
                        totalSum += 2.5;
                    } else {
                        sum += 1;
                        totalSum += 1;
                    }
                }
            }

            System.out.printf ("Day: %d - %.2f leva%n", currentDay, sum);

        }

        System.out.printf("Total: %.2f leva", totalSum);

    }

}
