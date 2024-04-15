import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        int videoCardPricePerPiece = 250;

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int videoCardQuantity = Integer.parseInt(scan.nextLine());
        int processorQuantity = Integer.parseInt(scan.nextLine());
        int memoryQuantity = Integer.parseInt(scan.nextLine());

        int videoCardsPrice = videoCardQuantity * videoCardPricePerPiece;
        double processorPricePerPiece = videoCardsPrice * 0.35;
        double memoryPricePerPiece = videoCardsPrice * 0.1;

        double processorsPrice = processorPricePerPiece * processorQuantity;
        double memoriesPrice = memoryPricePerPiece * memoryQuantity;

        double totalPrice = videoCardsPrice + processorsPrice + memoriesPrice;

        if (videoCardQuantity > processorQuantity) {
            totalPrice = totalPrice * 0.85;
        }

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", (budget - totalPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", (totalPrice - budget));
        }

    }

}
