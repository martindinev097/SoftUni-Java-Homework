import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        double chickenMenu = 10.35;
        double fishMenu = 12.4;
        double vegMenu = 8.15;
        double deliveryCost = 2.5;

        Scanner scan = new Scanner(System.in);

        int chickenMenuCount = Integer.parseInt(scan.nextLine());
        int fishMenuCount = Integer.parseInt(scan.nextLine());
        int vegMenuCount = Integer.parseInt(scan.nextLine());

        double chickenMenuTotal = chickenMenu * chickenMenuCount;
        double fishMenuTotal = fishMenu * fishMenuCount;
        double vegMenuTotal = vegMenu * vegMenuCount;
        double dessert = (chickenMenuTotal + fishMenuTotal + vegMenuTotal) * 0.2;

        double totalCost = chickenMenuTotal + fishMenuTotal + vegMenuTotal + dessert + deliveryCost;

        System.out.println(totalCost);

    }

}
