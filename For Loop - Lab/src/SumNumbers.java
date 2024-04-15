import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numbers = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 1; i <= numbers; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum = sum + num;
        }

        System.out.println(sum);

    }

}
