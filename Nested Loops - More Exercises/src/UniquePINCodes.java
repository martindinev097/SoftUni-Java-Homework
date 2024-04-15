import java.util.Scanner;

public class UniquePINCodes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        for (int num = 1; num <= firstNum; num++) {
            for (int num2 = 2; num2 <= secondNum; num2++) {
                for (int num3 = 1; num3 <= thirdNum; num3++) {
                    if (num % 2 == 0 && num3 % 2 == 0) {
                        if (num2 == 2 || num2 == 3 || num2 == 5 || num2 == 7) {
                            System.out.printf("%d %d %d%n", num, num2, num3);
                        }
                    }
                }
            }
        }
    }
}
