import java.io.PrintStream;
import java.util.Scanner;

public class SumPrimeNonPrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int prime = 0;
        int nonPrime = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            if (number < 0) {
                System.out.println("Number is negative.");
                command = scan.nextLine();
                continue;
            }

            if (number % 2 == 0 && number != 2) {
                nonPrime += number;
            } else if (number % 3 == 0 && number != 3) {
                nonPrime += number;
            } else if (number % 5 == 0 && number != 5) {
                nonPrime += number;
            } else if (number % 7 == 0 && number != 7) {
                nonPrime += number;
            } else {
                prime += number;
            }

            command = scan.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrime);

    }

}