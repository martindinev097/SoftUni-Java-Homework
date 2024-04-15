import java.util.Scanner;

public class TimeAnd15Minutes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int time = 0;
        int hours = 0;
        int clock = minutes + 15;

        if (clock >= 60) {
            hours = hour + 1;
            time = 15 - (60 - minutes);
            int newHours = hours - 24;

            if (hours >= 24 && time >= 10) {
                System.out.printf("%d:%d", newHours, time);
            }
            if (hours >= 24 && time < 10) {
                System.out.printf("%d:0%d", newHours, time);
            } else if (hours < 24 && time < 10) {
                System.out.printf("%d:0%d", hours, time);
            } else if (hours < 24) {
                System.out.printf("%d:%d", hours, time);
            }
        } else {
            System.out.printf("%d:%d", hour, clock);
        }

    }
}