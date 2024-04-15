import java.util.Scanner;

public class BackToThePast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double inheritMoney = Double.parseDouble(scan.nextLine());
        int yearToLive = Integer.parseInt(scan.nextLine());

        int currentAge = 18;
        double moneyLeft = 0;

        for (int currentYear = 1800; currentYear <= yearToLive; currentYear++) {
            if (currentYear % 2 == 0) {
                inheritMoney = inheritMoney - 12000;
                currentAge++;
            } else {
                inheritMoney = inheritMoney - (12000 + (50 * currentAge));
                currentAge++;
            }
        }

        if (inheritMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritMoney));
        }
    }

}
