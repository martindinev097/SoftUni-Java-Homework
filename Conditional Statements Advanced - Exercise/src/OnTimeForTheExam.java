import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minuteExam = Integer.parseInt(scan.nextLine());
        int hourArrival = Integer.parseInt(scan.nextLine());
        int minuteArrival = Integer.parseInt(scan.nextLine());

        int examInMin = hourExam * 60 + minuteExam;
        int arrivalInMin = hourArrival * 60 + minuteArrival;

        if (arrivalInMin > examInMin) {
            if (arrivalInMin - examInMin < 60) {
                System.out.printf("Late%n%d minutes after the start", arrivalInMin - examInMin);
            } else {
                System.out.printf("Late%n%d:%02d hours after the start", hourArrival - hourExam, Math.abs(minuteArrival - minuteExam));
            }
        } else if (examInMin == arrivalInMin) {
            System.out.println("On time");
        } else if (examInMin - arrivalInMin <= 30 && examInMin - arrivalInMin > 0) {
            System.out.printf("On time%n%d minutes before the start", examInMin - arrivalInMin);
        } else if (examInMin - arrivalInMin > 30 && examInMin - arrivalInMin < 60) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", examInMin - arrivalInMin);
        } else if (examInMin - arrivalInMin >= 60) {
            System.out.printf("Early%n%d:%02d hours before the start", hourExam - hourArrival, Math.abs(minuteExam - minuteArrival));
        }

    }

}