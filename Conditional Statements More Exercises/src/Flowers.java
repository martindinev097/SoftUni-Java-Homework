import java.util.Scanner;

public class Flowers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();
        double totalSum = 0.0;

        switch (season) {
            case "Spring":
                totalSum = hrizantemi * 2.0 + roses * 4.1 + tulips * 2.5;
                if (holiday.equals("Y")) {
                    totalSum = totalSum * 1.15;
                    if (tulips > 7) {
                        totalSum = totalSum * 0.95;
                    }
                } else if (holiday.equals("N")) {
                    if (tulips > 7) {
                        totalSum = totalSum * 0.95;
                    }
                }
                break;
            case "Summer":
                totalSum = hrizantemi * 2.0 + roses * 4.1 + tulips * 2.5;
                if (holiday.equals("Y")) {
                    totalSum = totalSum * 1.15;
                }
                break;

            case "Autumn":
                totalSum = hrizantemi * 3.75 + roses * 4.5 + tulips * 4.15;
                if (holiday.equals("Y")) {
                    totalSum = totalSum * 1.15;
                }
                break;
            case "Winter":
                totalSum = hrizantemi * 3.75 + roses * 4.5 + tulips * 4.15;
                if (holiday.equals("Y")) {
                    totalSum = totalSum * 1.15;
                    if (roses >= 10) {
                        totalSum = totalSum * 0.9;
                    }
                } else if (holiday.equals("N")) {
                    if (roses >= 10) {
                        totalSum = totalSum * 0.90;
                    }
                }
                break;
        }

        if (hrizantemi + roses + tulips > 20) {
            totalSum = totalSum * 0.8;
            System.out.printf("%.2f", totalSum + 2);
        } else {
            System.out.printf("%.2f", totalSum + 2);
        }

    }
}