import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scan.nextLine());
        String occupation = scan.nextLine();
        String dayOfWeek = scan.nextLine();

        double price = 0;

        switch (occupation) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    price = peopleCount * 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = peopleCount * 9.8;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = peopleCount * 10.46;
                }

                if (peopleCount >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    price = peopleCount * 10.9;
                    if (peopleCount >= 100) {
                        price = price - (10 * 10.9);
                    }
                } else if (dayOfWeek.equals("Saturday")) {
                    price = peopleCount * 15.6;
                    if (peopleCount >= 100) {
                        price = price - (10 * 15.6);
                    }
                } else if (dayOfWeek.equals("Sunday")) {
                    price = peopleCount * 16;
                    if (peopleCount >= 100) {
                        price = price - (10 * 16);
                    }
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    price = peopleCount * 15;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = peopleCount * 20;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = peopleCount * 22.5;
                }

                if (peopleCount >= 10 && peopleCount <= 20) {
                    price *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f", price);

    }

}
