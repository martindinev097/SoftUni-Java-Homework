import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int orders = Integer.parseInt(scan.nextLine());

        double coffeePrice = 0;
        double totalPrice = 0;

        for (int order = 1; order <= orders; order++) {
            double price = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int count = Integer.parseInt(scan.nextLine());

            coffeePrice = days * count * price;

            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);

            totalPrice += coffeePrice;

            coffeePrice = 0;
        }

        System.out.printf("Total: $%.2f", totalPrice);

    }

}
