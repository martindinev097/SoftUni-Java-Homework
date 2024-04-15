import java.util.Scanner;

public class PrintAndSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int num = start; num <= end; num++) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println();
        System.out.println("Sum: " + sum);

    }

}