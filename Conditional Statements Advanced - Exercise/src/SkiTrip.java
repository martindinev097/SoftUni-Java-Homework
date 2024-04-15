import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {

        double roomForOne = 18.0;
        double apartment = 25.0;
        double presidentApartment = 35.0;

        Scanner scan = new Scanner(System.in);

        int daysStay = Integer.parseInt(scan.nextLine());
        String place = scan.nextLine();
        String feedback = scan.nextLine();

        int nightStay = daysStay - 1;
        double price = 0.0;

        switch (place) {
            case "room for one person":
                price = nightStay * roomForOne;
                break;

            case "apartment":
                if (daysStay < 10) {
                    price = nightStay * apartment * 0.7;
                } else if (daysStay <= 15) {
                    price = nightStay * apartment * 0.65;
                } else {
                    price = nightStay * apartment * 0.5;
                }
                break;

            case "president apartment":
                if (daysStay < 10) {
                    price = nightStay * presidentApartment * 0.9;
                } else if (daysStay <= 15) {
                    price = nightStay * presidentApartment * 0.85;
                } else {
                    price = nightStay * presidentApartment * 0.8;
                }
                break;

        }

        if (feedback.equals("positive")) {
            price = price * 1.25;
        } else if (feedback.equals("negative")) {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);

    }
}
