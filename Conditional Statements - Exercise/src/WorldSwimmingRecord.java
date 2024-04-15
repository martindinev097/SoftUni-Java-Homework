import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double worldRecordInSec = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timePerMeter = Double.parseDouble(scan.nextLine());

        double timeHeSwims = distanceInMeters * timePerMeter;
        double timeOfResistance = (int) (distanceInMeters / 15) * 12.5;

        if (distanceInMeters >= 15) {
            timeHeSwims = distanceInMeters * timePerMeter + timeOfResistance;
        } else {
            timeHeSwims = distanceInMeters * timePerMeter;
        }

        if (timeHeSwims < worldRecordInSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeHeSwims);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (timeHeSwims - worldRecordInSec));
        }

    }
}
