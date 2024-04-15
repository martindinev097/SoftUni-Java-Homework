import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double clothesPricePerPerson = Double.parseDouble(scan.nextLine());

        double clothesPrice = clothesPricePerPerson * people;
        double movieDecor = budget * 0.1;

        if (people > 150) {
            clothesPrice = clothesPrice * 0.9;
        }

        if ((movieDecor + clothesPrice) > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", ((movieDecor + clothesPrice) - budget));
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", (budget - (movieDecor + clothesPrice)));
        }

    }

}
