import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String num = String.valueOf(number);

        int sum = 0;

        for (int position = 0; position < num.length(); position++) {
            //char currentChar = num.charAt(position);
            //String currentString = String.valueOf(currentChar);
            //int currentDigit = Integer.parseInt(currentString);

            int currentDigit = Integer.parseInt(String.valueOf(num.charAt(position)));

            int sumOfI = 1;

            for (int i = 1; i <= currentDigit; i++) {
                sumOfI *= i;
            }

            sum = sum + sumOfI;

        }

        if (number == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
