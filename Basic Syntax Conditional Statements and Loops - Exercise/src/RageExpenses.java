import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double expenses = 0;
        int trashCount = 0;

        for (int currentLostGame = 1; currentLostGame <= lostGames; currentLostGame++) {
            if (currentLostGame % 2 == 0 && currentLostGame % 3 != 0) {
                expenses += headsetPrice;
            }

            if (currentLostGame % 3 == 0 && currentLostGame % 2 != 0) {
                expenses += mousePrice;
            }

            if (currentLostGame % 2 == 0 && currentLostGame % 3 == 0) {
                expenses += headsetPrice + mousePrice + keyboardPrice;
                trashCount++;
            }

            if (trashCount == 2) {
                expenses += displayPrice;
                trashCount = 0;
            }

        }

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }

}
