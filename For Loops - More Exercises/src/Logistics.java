import java.util.Scanner;

public class Logistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int packageCount = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        double totalWeight = 0;
        double weightBus = 0;
        double weightTruck = 0;
        double weightTrain = 0;

        for (int i = 1; i <= packageCount; i++) {
            int packageWeight = Integer.parseInt(scan.nextLine());
            totalWeight = totalWeight + packageWeight;

            if (packageWeight <= 3) {
                price += packageWeight * 200;
                weightBus += packageWeight;
            } else if (packageWeight <= 11) {
                price += packageWeight * 175;
                weightTruck += packageWeight;
            } else {
                price += packageWeight * 120;
                weightTrain += packageWeight;
            }
        }

        System.out.printf("%.2f%n", price / totalWeight);
        System.out.printf("%.2f%%%n", (weightBus / totalWeight) * 100);
        System.out.printf("%.2f%%%n", (weightTruck / totalWeight) * 100);
        System.out.printf("%.2f%%", (weightTrain / totalWeight) * 100);

    }

}
