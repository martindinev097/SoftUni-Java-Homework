import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10");
            return;
        } else if (number % 7 == 0) {
            System.out.println("The number is divisible by 7");
            return;
        } else if (number % 6 == 0) {
            System.out.println("The number is divisible by 6");
            return;
        } else if (number % 3 == 0) {
            System.out.println("The number is divisible by 3");
            return;
        } else if (number % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }

    }

}