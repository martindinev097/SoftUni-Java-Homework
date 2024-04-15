import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washerPrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toyCount = 0;
        int money = 0;

        if (age % 2 == 0) {
            for (int i = 1; i <= age / 2; i++) {
                money = money + 10 * i;
                toyCount = toyCount + 1;
            }

            money = money - (age / 2);


        } else {
            for (int i = 1; i <= age / 2; i++) {
                money = money + 10 * i;
            }
            toyCount = (age / 2) + 1;
            money = money - (age / 2);
        }

        int toyEarnings = toyCount * toyPrice;

        if (washerPrice <= money + toyEarnings) {
            System.out.printf("Yes! %.2f", ((money + toyEarnings) - washerPrice));
        } else {
            System.out.printf("No! %.2f", ((washerPrice - (toyEarnings + money))));
        }

    }

}