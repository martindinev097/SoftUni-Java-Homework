import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int prime = 0;
        int nonPrime = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            boolean isPrime = true;

            if (number < 0) {
                System.out.println("Number is negative.");
                command = scan.nextLine();
                continue;
            }

            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    nonPrime += number;
                    break;
                }
            }

            if (isPrime) {
                prime += number;
            }

            command = scan.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrime);

    }

}