import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String accomodation = "";
        String place = "";
        double price = 0.0;

        if (season.equals("Summer")) {
            if (budget <= 1000) {
                accomodation = "Camp";
                place = "Alaska";
                price = budget * 0.65;
            } else if (budget <= 3000) {
                accomodation = "Hut";
                place = "Alaska";
                price = budget * 0.8;
            } else {
                accomodation = "Hotel";
                place = "Alaska";
                price = budget * 0.9;
            }
        } else if (season.equals("Winter")) {
            if (budget <= 1000) {
                accomodation = "Camp";
                place = "Morocco";
                price = budget * 0.45;
            } else if (budget <= 3000) {
                accomodation = "Hut";
                place = "Morocco";
                price = budget * 0.6;
            } else {
                accomodation = "Hotel";
                place = "Morocco";
                price = budget * 0.9;
            }
        }

        System.out.printf("%s - %s - %.2f", place, accomodation, price);

    }

}
