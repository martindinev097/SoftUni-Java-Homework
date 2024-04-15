import java.util.Scanner;

public class TruckDriver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        double kmPerMonth = Double.parseDouble(scan.nextLine());
        double payment = 0.0;

        if (season.equals("Spring") || season.equals("Autumn")) {
            if  (kmPerMonth <= 5000) {
                payment = kmPerMonth * 0.75 * 0.9 * 4;
            } else if (kmPerMonth <= 10000) {
                payment = kmPerMonth * 0.95 * 0.9 * 4;
            } else if (kmPerMonth <= 20000) {
                payment = kmPerMonth * 1.45 * 0.9 * 4;
            }
        } else if (season.equals("Summer")) {
            if  (kmPerMonth <= 5000) {
                payment = kmPerMonth * 0.9 * 0.9 * 4;
            } else if (kmPerMonth <= 10000) {
                payment = kmPerMonth * 1.10 * 0.9 * 4;
            } else if (kmPerMonth <= 20000) {
                payment = kmPerMonth * 1.45 * 0.9 * 4;
            }
        } else if (season.equals("Winter")) {
            if  (kmPerMonth <= 5000) {
                payment = kmPerMonth * 1.05 * 0.9 * 4;
            } else if (kmPerMonth <= 10000) {
                payment = kmPerMonth * 1.25 * 0.9 * 4;
            } else if (kmPerMonth <= 20000) {
                payment = kmPerMonth * 1.45 * 0.9 * 4;
            }
        }

        System.out.printf ("%.2f", payment);

    }

}
