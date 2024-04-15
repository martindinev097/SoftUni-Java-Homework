import java.util.Scanner;

public class Harvest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fieldSqM = Integer.parseInt(scan.nextLine());
        double grapesPerSqM = Double.parseDouble(scan.nextLine());
        int neededWineLitres = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double wineProduction = 0.4 * fieldSqM * grapesPerSqM;
        double litresWineCanBeProduced = wineProduction / 2.5;

        if(litresWineCanBeProduced >= neededWineLitres) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(litresWineCanBeProduced));
            double wineLeft = litresWineCanBeProduced - neededWineLitres;
            double wineToBeDistributedToWorkers = wineLeft / workers;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(wineToBeDistributedToWorkers));
        } else {
            double notEnoughWine = neededWineLitres - litresWineCanBeProduced;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(notEnoughWine));
        }

    }

}