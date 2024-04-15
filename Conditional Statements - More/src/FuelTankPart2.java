import java.util.Scanner;

public class FuelTankPart2 {

    public static void main(String[] args) {

        double gas = 2.22;
        double diesel = 2.33;
        double gasoline = 0.93;

        Scanner scan = new Scanner(System.in);

        String typeOfFuel = scan.nextLine();
        double fuelLitres = Double.parseDouble(scan.nextLine());
        String clubCard = scan.nextLine();
        double regularGasPrice = fuelLitres * gas;
        double regularDieselPrice = fuelLitres * diesel;
        double regularGasolinePrice = fuelLitres * gasoline;

        double priceWithDiscountGas = (fuelLitres * gas) - (fuelLitres * 0.18);
        double priceWithDiscountDiesel = (fuelLitres * diesel) - (fuelLitres * 0.12);
        double priceWithDiscountGasoline = (fuelLitres * gasoline) - (fuelLitres * 0.08);

        if(clubCard.equals("Yes") && typeOfFuel.equals("Gasoline") && fuelLitres >= 20 && fuelLitres <= 25) {
            double newGasDiscountPrice = priceWithDiscountGas * 0.92;
            System.out.printf("%.2f lv.", newGasDiscountPrice);
        } else if (clubCard.equals("Yes") && typeOfFuel.equals("Gasoline") && fuelLitres > 25) {
            double newGasDiscountPrice = priceWithDiscountGas * 0.9;
            System.out.printf("%.2f lv.", newGasDiscountPrice);
        } else if (clubCard.equals("No") && typeOfFuel.equals("Gasoline") && fuelLitres >= 20 && fuelLitres <= 25) {
            double newPrice = regularGasPrice * 0.92;
            System.out.printf("%.2f lv.", newPrice);
        } else if (clubCard.equals("No") && typeOfFuel.equals("Gasoline") && fuelLitres > 25) {
            double newPrice = regularGasPrice * 0.90;
            System.out.printf("%.2f lv.", newPrice);
        } else if(clubCard.equals("Yes") && typeOfFuel.equals("Gasoline") && fuelLitres < 20) {
            System.out.printf("%.2f lv.", priceWithDiscountGas);
        } else if(clubCard.equals("No") && typeOfFuel.equals("Gasoline") && fuelLitres < 20) {
            System.out.printf("%.2f lv.", (fuelLitres * gas));
        }

        if(clubCard.equals("Yes") && typeOfFuel.equals("Gas") && fuelLitres >= 20 && fuelLitres <= 25) {
            double newGasDiscountPrice = priceWithDiscountGasoline * 0.92;
            System.out.printf("%.2f lv.", newGasDiscountPrice);
        } else if (clubCard.equals("Yes") && typeOfFuel.equals("Gas") && fuelLitres > 25) {
            double newGasDiscountPrice = priceWithDiscountGasoline * 0.9;
            System.out.printf("%.2f lv.", newGasDiscountPrice);
        } else if (clubCard.equals("No") && typeOfFuel.equals("Gas") && fuelLitres >= 20 && fuelLitres <= 25) {
            double newPrice = regularGasolinePrice * 0.92;
            System.out.printf("%.2f lv.", newPrice);
        } else if (clubCard.equals("No") && typeOfFuel.equals("Gas") && fuelLitres > 25) {
            double newPrice = regularGasolinePrice * 0.90;
            System.out.printf("%.2f lv.", newPrice);
        } else if(clubCard.equals("Yes") && typeOfFuel.equals("Gas") && fuelLitres < 20) {
            System.out.printf("%.2f lv.", priceWithDiscountGasoline);
        } else if(clubCard.equals("No") && typeOfFuel.equals("Gas") && fuelLitres < 20) {
            System.out.printf("%.2f lv.", (fuelLitres * gasoline));
        }

        if(clubCard.equals("Yes") && typeOfFuel.equals("Diesel") && fuelLitres >= 20 && fuelLitres <= 25) {
            double newGasDiscountPrice = priceWithDiscountDiesel * 0.92;
            System.out.printf("%.2f lv.", newGasDiscountPrice);
        } else if (clubCard.equals("Yes") && typeOfFuel.equals("Diesel") && fuelLitres > 25) {
            double newGasDiscountPrice = priceWithDiscountDiesel * 0.9;
            System.out.printf("%.2f lv.", newGasDiscountPrice);
        } else if (clubCard.equals("No") && typeOfFuel.equals("Diesel") && fuelLitres >= 20 && fuelLitres <= 25) {
            double newPrice = regularDieselPrice * 0.92;
            System.out.printf("%.2f lv.", newPrice);
        } else if (clubCard.equals("No") && typeOfFuel.equals("Diesel") && fuelLitres > 25) {
            double newPrice = regularDieselPrice * 0.90;
            System.out.printf("%.2f lv.", newPrice);
        } else if(clubCard.equals("Yes") && typeOfFuel.equals("Diesel") && fuelLitres < 20) {
            System.out.printf("%.2f lv.", priceWithDiscountDiesel);
        } else if(clubCard.equals("No") && typeOfFuel.equals("Diesel") && fuelLitres < 20) {
            System.out.printf("%.2f lv.", (fuelLitres * diesel));
        }
    }

}