import java.util.Scanner;

public class MatchTickets {

    public static void main(String[] args) {

        double vipTicket = 499.99;
        double normalTicket = 249.99;

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine(); // VIP or Normal
        int peopleCount = Integer.parseInt(scan.nextLine());
        double allCost = 0.0;
        double transport = 0.0;

        switch (category) {
            case "VIP":
                allCost = peopleCount * vipTicket;

                if (peopleCount >= 1 && peopleCount < 5) {
                    transport = budget * 0.75;
                } else if (peopleCount < 10) {
                    transport = budget * 0.6;
                } else if (peopleCount < 25) {
                    transport = budget * 0.5;
                } else if (peopleCount < 50) {
                    transport = budget * 0.4;
                } else {
                    transport = budget * 0.25;
                }

                double totalCost = allCost + transport;

                if (totalCost <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - totalCost);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", totalCost - budget);
                }
                break;
            case "Normal":
                allCost = peopleCount * normalTicket;

                if (peopleCount >= 1 && peopleCount < 5) {
                    transport = budget * 0.75;
                } else if (peopleCount < 10) {
                    transport = budget * 0.6;
                } else if (peopleCount < 25) {
                    transport = budget * 0.5;
                } else if (peopleCount < 50) {
                    transport = budget * 0.4;
                } else {
                    transport = budget * 0.25;
                }

                double totalCostNormal = allCost + transport;

                if (totalCostNormal <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - totalCostNormal);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", totalCostNormal - budget);
                }
                break;

        }

    }

}
