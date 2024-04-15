import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double vegetables = Double.parseDouble(scan.nextLine());
        double fruits = Double.parseDouble(scan.nextLine());
        double totalVegetablesKgs = Double.parseDouble(scan.nextLine());
        double totalFruitsKgs = Double.parseDouble(scan.nextLine());
        double euro = 1.94;

        double incomeForVegetables = vegetables * totalVegetablesKgs;
        double incomeForFruits = fruits * totalFruitsKgs;

        double allIncome = (incomeForVegetables + incomeForFruits) / euro;

        System.out.printf("%.2f", allIncome);

    }

}