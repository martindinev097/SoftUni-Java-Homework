import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        double totalPrice = 0;

        switch (month) {
            case "May":
            case "October":
                if (days > 7 && days <= 14) {
                    studioPrice = days * 50 * 0.95;
                    apartmentPrice = days * 65;
                } else if (days > 14) {
                    studioPrice = days * 50 * 0.7;
                    apartmentPrice = days * 65 * 0.9;
                } else {
                    studioPrice = days * 50;
                    apartmentPrice = days * 65;
                }
                break;

            case "June":
            case "September":
                if (days > 14) {
                    studioPrice = days * 75.2 * 0.8;
                    apartmentPrice = days * 68.7 * 0.9;
                } else {
                    studioPrice = days * 75.2;
                    apartmentPrice = days * 68.7;
                }
                break;

            case "July":
            case "August":
                if (days > 14) {
                    studioPrice = days * 76;
                    apartmentPrice = days * 77 * 0.9;
                } else {
                    studioPrice = days * 76;
                    apartmentPrice = days * 77;
                }
                break;

        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }

}
