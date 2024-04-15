import java.util.Scanner;

public class TimeAfter30Minutes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        hours = hours * 60;

        int total = hours + minutes + 30;

        int currentHour = total / 60;
        int currentMinutes = total % 60;

        if (currentHour >= 24) {
            currentHour = currentHour - 24;
        }

        System.out.printf("%d:%02d", currentHour, currentMinutes);

    }

}
