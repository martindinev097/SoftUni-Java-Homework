import java.util.Scanner;

public class Bills {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double water = 20.0;
        double internet = 15.0;

        int months = Integer.parseInt(scan.nextLine());

        double elseExpenses = 0.0;
        double electricityTotal = 0.0;
        double waterTotal = 20 * months;
        double internetTotal = 15 * months;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());

            electricityTotal += electricity;
            elseExpenses += (electricity + water + internet) * 1.2;

        }

        double totalExpenses = waterTotal + internetTotal + electricityTotal + elseExpenses;

        System.out.printf("Electricity: %.2f lv%n", electricityTotal);
        System.out.printf("Water: %.2f lv%n", waterTotal);
        System.out.printf("Internet: %.2f lv%n", internetTotal);
        System.out.printf("Other: %.2f lv%n", elseExpenses);
        System.out.printf("Average: %.2f lv%n", totalExpenses / months);
    }

}
