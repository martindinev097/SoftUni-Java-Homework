import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scan.nextLine());
        double cacaPrice = Double.parseDouble(scan.nextLine());
        double palamudKgs = Double.parseDouble(scan.nextLine());
        double safridKgs = Double.parseDouble(scan.nextLine());
        double midiKgs = Double.parseDouble(scan.nextLine());
        double midiPrice = 7.5;
        double palamudPrice = skumriqPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;

        double totalSum = (palamudPrice * palamudKgs) + (safridPrice * safridKgs) + (midiPrice * midiKgs);

        System.out.printf("%.2f", totalSum);

    }

}
