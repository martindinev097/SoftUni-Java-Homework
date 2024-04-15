import java.util.Scanner;

public class BikeRace {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scan.nextLine());
        int seniorsCount = Integer.parseInt(scan.nextLine());
        String track = scan.nextLine();
        double revenueJuniors = 0.0;
        double revenueSeniors = 0.0;
        double totalRevenue = 0.0;

        if (track.equals("trail")) {
            revenueJuniors = juniorsCount * 5.5;
            revenueSeniors = seniorsCount * 7;
            totalRevenue = revenueJuniors + revenueSeniors;
            double donation = totalRevenue * 0.95;
            System.out.printf("%.2f", donation);
        } else if (track.equals("cross-country")) {
            revenueJuniors = juniorsCount * 8;
            revenueSeniors = seniorsCount * 9.5;
            totalRevenue = revenueJuniors + revenueSeniors;

            if (juniorsCount + seniorsCount >= 50) {
                totalRevenue = totalRevenue * 0.75;
            } else {
                totalRevenue = revenueJuniors + revenueSeniors;
            }

            double donation = totalRevenue * 0.95;

            System.out.printf("%.2f", donation);
        } else if (track.equals("downhill")) {
            revenueJuniors = juniorsCount * 12.25;
            revenueSeniors = seniorsCount * 13.75;
            totalRevenue = revenueJuniors + revenueSeniors;
            double donation = totalRevenue * 0.95;
            System.out.printf("%.2f", donation);
        } else if (track.equals("road")) {
            revenueJuniors = juniorsCount * 20.0;
            revenueSeniors = seniorsCount * 21.5;
            totalRevenue = revenueJuniors + revenueSeniors;
            double donation = totalRevenue * 0.95;
            System.out.printf("%.2f", donation);
        }

    }

}
