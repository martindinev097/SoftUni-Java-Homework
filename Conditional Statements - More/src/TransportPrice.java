import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int km = Integer.parseInt(scan.nextLine());
        String timeOfDay = scan.nextLine();

        double taxiPriceDayPerKm = 0.79;
        double taxiPriceNightPerKm = 0.9;
        double busPricePerKm = 0.09;
        double trainPricePerKm = 0.06;

        if(km < 20 && timeOfDay.equals("day")) {
            double price = km * taxiPriceDayPerKm + 0.7;
            System.out.printf("%.2f", price);
        } else if (km < 20 && timeOfDay.equals("night")) {
            double nightPrice = km * taxiPriceNightPerKm + 0.7;
            System.out.printf("%.2f", nightPrice);
        }

        if(km >= 20 && km < 100) {
            double price = km * busPricePerKm;
            System.out.printf("%.2f", price);
        } else if(km >= 100){
            double price = km * trainPricePerKm;
            System.out.printf("%.2f", price);
        }

    }

}
