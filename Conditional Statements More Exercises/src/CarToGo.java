import java.util.Scanner;

public class CarToGo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String classCar = "";
        String car = "";
        double priceCabrio = 0.0;
        double priceJeep = 0.0;

        switch (season) {
            case "Summer":

                if (budget <= 100) {
                    classCar = "Economy class";
                    priceCabrio = budget * 0.35;
                    System.out.println(classCar);
                    System.out.printf("Cabrio - %.2f", priceCabrio);
                } else if (budget <= 500) {
                    classCar = "Compact class";
                    priceCabrio = budget * 0.45;
                    System.out.println(classCar);
                    System.out.printf("Cabrio - %.2f", priceCabrio);
                }

                break;

            case "Winter":

                if (budget <= 100) {
                    classCar = "Economy class";
                    priceJeep = budget * 0.65;
                    System.out.println(classCar);
                    System.out.printf("Jeep - %.2f", priceJeep);
                } else if (budget <= 500) {
                    classCar = "Compact class";
                    priceJeep = budget * 0.8;
                    System.out.println(classCar);
                    System.out.printf("Jeep - %.2f", priceJeep);
                }
                break;

        }

        if (budget > 500) {
            classCar = "Luxury class";
            priceJeep = budget * 0.9;

            System.out.println(classCar);
            System.out.printf("Jeep - %.2f", priceJeep);
        }

    }

}