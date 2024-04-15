import java.util.Scanner;

public class SleepyTomCat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int freeDays = Integer.parseInt(scan.nextLine());
        int daysInYear = 365;
        int playNormPerYear = 30000;
        int workDaysPlayTimePerDay = 63;
        int freeDaysPlayTimePerDay = 127;

        int workingDays = daysInYear - freeDays;
        int playTimeInWorkingDays = workingDays * workDaysPlayTimePerDay;
        int playTimeInFreeDays = freeDays * freeDaysPlayTimePerDay;
        int allPlayTimePerYear = playTimeInWorkingDays + playTimeInFreeDays;

        if (allPlayTimePerYear > playNormPerYear) {
            double differenceInNormHours = Math.floor((double) (allPlayTimePerYear - playNormPerYear) / 60);
            double differenceInNormMinutes = (double) (allPlayTimePerYear - playNormPerYear) % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", differenceInNormHours, differenceInNormMinutes);
        } else {
            double differenceInNormHours = Math.floor((double) (playNormPerYear - allPlayTimePerYear) / 60);
            double differenceInNormMinutes = (double) (playNormPerYear - allPlayTimePerYear) % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", differenceInNormHours, differenceInNormMinutes);
        }

    }

}
