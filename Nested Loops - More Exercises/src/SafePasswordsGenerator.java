import java.util.Scanner;

public class SafePasswordsGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int maxPass = Integer.parseInt(scan.nextLine());

        int passCount = 0;

        int A = 35;
        int B = 64;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                passCount++;

                if (passCount > maxPass) {
                    return;
                }

                char one = (char) A;
                char two = (char) B;

                System.out.printf("%c%c%d%d%c%c|", one, two, x, y, two, one);

                A++;
                B++;

                if (A > 55) {
                    A = 35;
                }

                if (B > 96) {
                    B = 64;
                }
            }
        }

    }

}