import java.util.Scanner;

public class Oscars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String actorName = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int judges = Integer.parseInt(scan.nextLine());
        double pointsGiven = 0.0;

        for (int i = 1; i <= judges; i++) {
            String judgeName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());

            judgePoints = pointsGiven + (judgeName.length() * judgePoints) / 2;
            pointsGiven = judgePoints;

            if (judgePoints + points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, judgePoints + points);
                break;
            }
        }

        if (pointsGiven + points <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - (pointsGiven + points));
        }

    }

}
