import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        for (int one = 1; one <= n; one++) {
            for (int two = 1; two <= n; two++) {
                for (char three = 97; three < 97 + l; three++) {
                    for (char four = 97; four < 97 + l; four++) {
                        for (int five = 1; five <= n; five++) {
                            if (five > one && five > two) {
                                System.out.printf("%d%d%c%c%d ", one, two, three, four, five);
                            }
                        }
                    }
                }
            }
        }

    }

}