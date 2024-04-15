import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        for (int one = 1; one <= 9; one++) {
            for (int two = 1; two <= 9; two++) {
                for (int three = 1; three <= 9; three++) {
                    for (int four = 1; four <= 9; four++) {
                        if (one + two == three + four && N % (one + two) == 0) {
                            System.out.printf("%d%d%d%d ", one, two, three, four);
                        }
                    }
                }
            }
        }

    }

}
