import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int kgFoodLeft = Integer.parseInt(scan.nextLine());
        double dogFoodKg = Double.parseDouble(scan.nextLine());
        double catFoodKg = Double.parseDouble(scan.nextLine());
        double turtleFoodGrams = Double.parseDouble(scan.nextLine());

        double turtleFoodKg = turtleFoodGrams / 1000;

        double allFoodNeeded = (dogFoodKg + catFoodKg + turtleFoodKg) * days;

        if (kgFoodLeft >= allFoodNeeded) {
            double foodLeft = kgFoodLeft - allFoodNeeded;
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft));
        } else {
            double foodNotEnough = allFoodNeeded - kgFoodLeft;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNotEnough));
        }

    }

}
