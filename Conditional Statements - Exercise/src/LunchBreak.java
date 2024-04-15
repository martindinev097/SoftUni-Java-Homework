import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String seriesName = scan.nextLine();
        int episodeTime = Integer.parseInt(scan.nextLine());
        int breakTime = Integer.parseInt(scan.nextLine());

        double lunchTime = (double) breakTime / 8;
        double restTime = (double) breakTime / 4;

        double timeYouBreak = lunchTime + restTime;
        double timeYouNeedForBreak = timeYouBreak + episodeTime;
        double freeTime = breakTime - timeYouNeedForBreak;

        if (breakTime >= timeYouNeedForBreak) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(freeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(timeYouNeedForBreak - breakTime));
        }

    }

}
