import java.util.Scanner;

public class SecretDoorLock {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int three = Integer.parseInt(scan.nextLine());

        for (int digit1 = 1; digit1 <= one; digit1++) {
            if (digit1 % 2 == 0) {
                for (int digit2 = 2; digit2 <= two; digit2++) {
                    if (digit2 == 2 || digit2 % 2 != 0 && digit2 <= 7) {
                        for (int digit3 = 1; digit3 <= three; digit3++) {
                            if (digit3 % 2 == 0) {
                                System.out.printf("%d %d %d%n", digit1, digit2, digit3);
                            }
                        }
                    }
                }
            }
        }
    }
}
