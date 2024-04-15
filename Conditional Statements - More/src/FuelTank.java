import java.util.Scanner;

public class FuelTank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String typeOfFuel = scan.nextLine();
        double fuelInTank = Double.parseDouble(scan.nextLine());

        if(typeOfFuel.equals("Diesel") || typeOfFuel.equals("Gasoline") || typeOfFuel.equals("Gas")) {
            if (fuelInTank >= 25) {
                System.out.printf("You have enough %s.", typeOfFuel.toLowerCase());
            } else if (fuelInTank < 25) {
                System.out.printf("Fill your tank with %s!", typeOfFuel.toLowerCase());
            }
        }
        else {
            System.out.print("Invalid fuel!");
        }

    }

}