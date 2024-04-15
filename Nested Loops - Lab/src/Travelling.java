import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        if (destination.equals("End")) {
            return;
        }
        double budget = Double.parseDouble(scan.nextLine());
        double savings = 0;

        while (!destination.equals("End")) {

            double savedMoney = Double.parseDouble(scan.nextLine());
            savings += savedMoney;

            while (savings < budget) {
                double moneySaved = Double.parseDouble(scan.nextLine());
                savings += moneySaved;
            }

            if (savings >= budget) {
                System.out.printf("Going to %s!%n", destination);
                savings = 0;
            }

            destination = scan.nextLine();

            if (destination.equals("End")) {
                break;
            }

            budget = Double.parseDouble(scan.nextLine());
        }

    }
}