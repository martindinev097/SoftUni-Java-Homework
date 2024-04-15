import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        double nylonPriceSqM = 1.5;
        double paintPricePerL = 14.5;
        double paintMixing = 5;

        Scanner scan = new Scanner(System.in);

        double nylon = Double.parseDouble(scan.nextLine());
        double paint = Double.parseDouble(scan.nextLine());
        double paintMix = Double.parseDouble(scan.nextLine());
        int hoursWork = Integer.parseInt(scan.nextLine());

        double nylonAddition = 2;
        double paintAddition = paint * 0.1;
        double bagExpense = 0.4;

        double nylonTotal = (nylon + nylonAddition) * nylonPriceSqM;
        double paintTotal = (paint + paintAddition) * paintPricePerL;
        double paintMixTotal = paintMix * paintMixing;
        double materialsCost = nylonTotal + paintTotal + paintMixTotal + bagExpense;

        double builderPayoutPerHour = materialsCost * 0.3;
        double totalPayoutForBuilders = builderPayoutPerHour * hoursWork;
        double totalSum = totalPayoutForBuilders + materialsCost;

        System.out.println(totalSum);

    }

}
