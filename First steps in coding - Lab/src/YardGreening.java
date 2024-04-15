import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        double sqM = Double.parseDouble(scan.nextLine());
        double pricePerSqM = 7.61;

        double totalSum = (sqM * pricePerSqM) * 0.82;
        double discount = (sqM * pricePerSqM) * 0.18;

        System.out.printf("The final price is: %f lv.%n", totalSum);
        System.out.printf("The discount is: %f lv.", discount);

    }

}