import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int nums = -1;

        for (int i = 1; i <= n; i++) {
            nums += 2;
            System.out.println(nums);
            sum += nums;
        }

        System.out.printf("Sum: %d", sum);

    }

}
