import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 15;

        if (minutes >= 60) {
            minutes = minutes - 60;
            hour = hour + 1;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

        System.out.printf ("%d:%02d", hour, minutes);

    }

}