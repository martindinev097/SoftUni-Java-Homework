import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", count);

                if (count == n) {
                    return;
                }

                count++;
            }

            System.out.println();

        }

    }

}