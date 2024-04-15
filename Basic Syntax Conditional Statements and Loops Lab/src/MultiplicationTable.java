import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            int sum = n * multiplier;
            System.out.printf("%d X %d = %d%n", n, multiplier, sum);
        }

    }

}