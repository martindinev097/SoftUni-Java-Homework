import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pricePerYear = Integer.parseInt(scan.nextLine());

        double trainers = pricePerYear * 0.6;
        double kit = trainers * 0.8;
        double ball = kit * 0.25;
        double accessories = ball * 0.2;

        double totalCost = pricePerYear + trainers + kit + ball + accessories;

        System.out.println(totalCost);

    }

}
