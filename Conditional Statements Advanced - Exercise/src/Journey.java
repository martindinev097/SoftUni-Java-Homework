import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double price = 0;
        String destination = "";
        String accomodation = "";

        //Summer - Camping, Winter - Hotel
        //If in Europe he will be staying at a Hotel at all times

        if (budget >= 1000) {
            price = budget * 0.9;
            destination = "Europe";
            accomodation = "Hotel";
        }

        switch (season) {
            case "summer":
                if(budget <= 100) {
                    price = budget * 0.3;
                    destination = "Bulgaria";
                    accomodation = "Camp";
                } else if (budget <= 1000) {
                    price = budget * 0.4;
                    destination = "Balkans";
                    accomodation = "Camp";
                }
                break;
            case "winter":
                if(budget <= 100) {
                    price = budget * 0.7;
                    destination = "Bulgaria";
                    accomodation = "Hotel";
                } else if (budget <= 1000) {
                    price = budget * 0.8;
                    destination = "Balkans";
                    accomodation = "Hotel";
                }
                break;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accomodation, price);

    }

}
