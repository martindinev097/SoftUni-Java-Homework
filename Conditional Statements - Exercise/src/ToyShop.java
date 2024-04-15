import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        double puzzle = 2.6;
        double doll = 3.0;
        double teddy = 4.1;
        double minion = 8.2;
        double truck = 2.0;

        Scanner scan = new Scanner(System.in);

        double priceOfExcursion = Double.parseDouble(scan.nextLine());
        double puzzleCount = Double.parseDouble(scan.nextLine());
        double dollCount = Double.parseDouble(scan.nextLine());
        double teddyCount = Double.parseDouble(scan.nextLine());
        double minionCount = Double.parseDouble(scan.nextLine());
        double truckCount = Double.parseDouble(scan.nextLine());

        double countOfToys = puzzleCount + dollCount + teddyCount + minionCount + truckCount;
        double totalPrice = puzzleCount * puzzle + dollCount * doll + teddyCount * teddy + minionCount * minion + truckCount * truck;
        double rentMoney = totalPrice * 0.1;
        double moneyLeft = 0;

        if (countOfToys >= 50) {
            totalPrice = totalPrice * 0.75;
            rentMoney = totalPrice * 0.1;
            moneyLeft = totalPrice - rentMoney;
        } else {
            moneyLeft = totalPrice - rentMoney;
        }

        if (moneyLeft >= priceOfExcursion) {
            System.out.printf("Yes! %.2f lv left.", (moneyLeft - priceOfExcursion));
        } else if (moneyLeft < priceOfExcursion) {
            double moneyNeeded = priceOfExcursion - moneyLeft;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }

}
