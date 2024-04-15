import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int groupCount = Integer.parseInt(scan.nextLine());
        int people = 0;
        int peopleMusala = 0;
        int peopleMontblanc = 0;
        int peopleKilimandzharo = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        for (int i = 1; i <= groupCount; i++) {
            int peopleCount = Integer.parseInt(scan.nextLine());

            people = people + peopleCount;

            if (peopleCount <= 5) {
                peopleMusala = peopleMusala + peopleCount;
            } else if (peopleCount <= 12) {
                peopleMontblanc += peopleCount;
            } else if (peopleCount <= 25) {
                peopleKilimandzharo += peopleCount;
            } else if (peopleCount <= 40) {
                peopleK2 += peopleCount;
            } else {
                peopleEverest += peopleCount;
            }
        }

        System.out.printf("%.2f%%%n", ((peopleMusala * 1.0 / people) * 100));
        System.out.printf("%.2f%%%n", ((peopleMontblanc * 1.0 / people) * 100));
        System.out.printf("%.2f%%%n", ((peopleKilimandzharo * 1.0 / people) * 100));
        System.out.printf("%.2f%%%n", ((peopleK2 * 1.0 / people) * 100));
        System.out.printf("%.2f%%%n", ((peopleEverest * 1.0 / people) * 100));

    }

}