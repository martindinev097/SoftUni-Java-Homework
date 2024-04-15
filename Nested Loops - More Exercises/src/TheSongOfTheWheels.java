import java.util.Scanner;

public class TheSongOfTheWheels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int M = Integer.parseInt(scan.nextLine());

        int count = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d) {
                            if ((a * b) + (c * d) == M) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                count++;

                                if (count == 4) {
                                    one = a;
                                    two = b;
                                    three = c;
                                    four = d;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (count >= 4) {
            System.out.printf("%nPassword: %d%d%d%d", one, two, three, four);
        } else if (count == 0) {
            System.out.println("No!");
        } else {
            System.out.println("\nNo!");
        }

    }

}
