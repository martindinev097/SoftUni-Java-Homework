import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        double penPrice = 5.80;
        double markerPrice = 7.20;
        double cleaningAgentPrice = 1.20;

        Scanner scan = new Scanner(System.in);

        int penQuantity = Integer.parseInt(scan.nextLine());
        int markerQuantity = Integer.parseInt(scan.nextLine());
        int cleaningAgentQuantity = Integer.parseInt(scan.nextLine());
        int discountPercentage = Integer.parseInt(scan.nextLine());

        double sum = ((penQuantity * penPrice) + (markerQuantity * markerPrice) + (cleaningAgentQuantity * cleaningAgentPrice)) * (100 - discountPercentage) / 100;
        System.out.print(sum);

    }

}
