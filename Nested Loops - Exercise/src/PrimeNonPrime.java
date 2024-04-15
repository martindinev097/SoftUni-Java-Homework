import java.util.Scanner;

public class PrimeNonPrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        commandLoop:
        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            if (number < 0) {
                System.out.println("Number is negative.");
                command = scan.nextLine();
                continue commandLoop;
            }

            for (int divide = 2; divide < number; divide++) {
                if (number % divide == 0) {
                    sumNonPrime += number;
                    command = scan.nextLine();
                    continue commandLoop;
                }
            }

            sumPrime += number;

            command = scan.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d\n", sumNonPrime);

    }
}