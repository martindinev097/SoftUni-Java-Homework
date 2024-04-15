import java.util.Scanner;

public class Travelling2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scan.nextLine());

            double savings = 0;

            while (savings < budget) {
                double savedMoney = Double.parseDouble(scan.nextLine());
                savings += savedMoney;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scan.nextLine();

        }

    }

}
