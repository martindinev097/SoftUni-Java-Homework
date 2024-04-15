import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String game = scan.nextLine();

        double storeBudget = budget;

        while (!game.equals("Game Time")) {

            if (budget == 0) {
                System.out.println("Out of money!");
                return;
            }

            switch (game) {
                case "RoverWatch Origins Edition":
                case "OutFall 4":
                    if (budget >= 39.99) {
                        System.out.printf("Bought %s%n", game);
                        budget -= 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (budget >= 15.99) {
                        System.out.printf("Bought %s%n", game);
                        budget -= 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        System.out.printf("Bought %s%n", game);
                        budget -= 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (budget >= 59.99) {
                        System.out.printf("Bought %s%n", game);
                        budget -= 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (budget >= 29.99) {
                        System.out.printf("Bought %s%n", game);
                        budget -= 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            game = scan.nextLine();

        }

        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", storeBudget - budget, budget);
        } else {
            System.out.println("Out of money!");
        }

    }

}