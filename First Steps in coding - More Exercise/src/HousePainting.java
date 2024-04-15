import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        double greenPaintLitreSqM = 3.4;
        double redPaintLitreSqM = 4.3;

        Scanner scan = new Scanner(System.in);

        double height = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double roofHeight = Double.parseDouble(scan.nextLine());

        double twoWalls = height * height - 2.4 + (height * height);
        double sideTwoWalls = 2 * (height * length) - 4.5;

        double neededGreenPaint = (twoWalls + sideTwoWalls) / 3.4;

        double roofTwoWalls = 2 * (height * length);
        double roofSideTwoWalls = 2 * ((height * roofHeight) / 2);

        double neededRedPaint = (roofTwoWalls + roofSideTwoWalls) / 4.3;

        System.out.printf("%.2f%n", neededGreenPaint);
        System.out.printf("%.2f", neededRedPaint);

    }

}
