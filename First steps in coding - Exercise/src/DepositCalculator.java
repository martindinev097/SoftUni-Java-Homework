import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double depositSum = Double.parseDouble(scan.nextLine());
        int depositTerm = Integer.parseInt(scan.nextLine());
        double interest =  Double.parseDouble(scan.nextLine());
        double interestPerYear = depositSum * (interest / 100);
        double interestPerMonth = interestPerYear / 12;
        double sum = depositSum + depositTerm * interestPerMonth;

        System.out.print(sum);
    }

}