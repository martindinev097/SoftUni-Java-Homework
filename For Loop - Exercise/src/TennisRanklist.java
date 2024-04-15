import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scan.nextLine());
        int startupPoints = Integer.parseInt(scan.nextLine());

        double points = 0.0;
        int wins = 0;

        for (int i = 1; i <= tournamentsCount; i++) {
            String place = scan.nextLine();

            switch (place) {
                case "W":
                    wins += 1;
                    points += 2000;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }

        }

        double finalPoints = points + startupPoints;
        double averagePoints = points / tournamentsCount;
        double percentageOfWins = (wins * 1.0 / tournamentsCount) * 100;

        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", percentageOfWins);
    }

}
