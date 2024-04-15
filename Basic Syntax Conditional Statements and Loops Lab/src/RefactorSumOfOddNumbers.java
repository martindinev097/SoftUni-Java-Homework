import java.util.Scanner;

public class RefactorSumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            sum += num;
            System.out.println(num);
            num += 2;
        }

        System.out.printf("Sum: %d%n", sum);

    }

}
