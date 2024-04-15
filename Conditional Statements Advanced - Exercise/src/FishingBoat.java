import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());

        double rentPrice = 0;

        switch(season) {
            case "Spring":
                if (fishermen <= 6) {
                    rentPrice = 3000 * 0.9;
                } else if (fishermen <= 11) {
                    rentPrice = 3000 * 0.85;
                } else {
                    rentPrice = 3000 * 0.75;
                }
                if (fishermen % 2 == 0) {
                    rentPrice = rentPrice * 0.95;
                }
                break;
            case "Summer":
            case "Autumn":
                if (fishermen <= 6) {
                    rentPrice = 4200 * 0.9;
                } else if (fishermen <= 11) {
                    rentPrice = 4200 * 0.85;
                } else {
                    rentPrice = 4200 * 0.75;
                }
                if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                    rentPrice = rentPrice * 0.95;
                }
                break;


            case "Winter":
                if (fishermen <= 6) {
                    rentPrice = 2600 * 0.9;
                } else if (fishermen <= 11) {
                    rentPrice = 2600 * 0.85;
                } else {
                    rentPrice = 2600 * 0.75;
                }
                if (fishermen % 2 == 0) {
                    rentPrice = rentPrice * 0.95;
                }
                break;

        }

        if(budget >= rentPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rentPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rentPrice - budget);
        }

    }

}
