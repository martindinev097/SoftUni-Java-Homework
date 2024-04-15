import java.util.Scanner;

public class Building {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int i = floors; i >= 1; i--) {

            if (i == floors) {
                for (int ir1 = 0; ir1 < rooms; ir1++) {
                    System.out.printf("L%d%d ", i, ir1);
                }
                System.out.println();
            }
            if (i % 2 == 0 && i != floors) {
                for (int ir2 = 0; ir2 < rooms; ir2++) {
                    System.out.printf("O%d%d ", i, ir2);
                }
                System.out.println();
            }

            if (i % 2 != 0 && i != floors) {
                for (int ir3 = 0; ir3 < rooms; ir3++) {
                    System.out.printf("A%d%d ", i, ir3);
                }
                System.out.println();
            }

        }

    }

}
