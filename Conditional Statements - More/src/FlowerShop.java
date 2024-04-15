import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {

        double magnoliya = 3.25;
        double zyumbyul = 4.0;
        double roses = 3.5;
        double cactus = 8.0;

        Scanner scan = new Scanner(System.in);

        int magnoliyaCount = Integer.parseInt(scan.nextLine());
        int zyumbyulCount = Integer.parseInt(scan.nextLine());
        int rosesCount = Integer.parseInt(scan.nextLine());
        int cactusCount = Integer.parseInt(scan.nextLine());
        double priceOfPresent = Double.parseDouble(scan.nextLine());

        double allProfitAfterTax = (magnoliyaCount * magnoliya + zyumbyulCount * zyumbyul + rosesCount * roses + cactusCount * cactus) * 0.95;

        if(allProfitAfterTax >= priceOfPresent) {
            double moneyLeft = allProfitAfterTax - priceOfPresent;
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        } else {
            double moneyNotEnough = priceOfPresent - allProfitAfterTax;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(moneyNotEnough));
        }
    }

}
