import java.util.Scanner;

public class ChallengeTheWedding {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int men = Integer.parseInt(scan.nextLine());
        int women = Integer.parseInt(scan.nextLine());
        int tables = Integer.parseInt(scan.nextLine());

        int count = 0;

        for (int meeting = 1; meeting <= men; meeting++) {
            for (int meeting2 = 1; meeting2 <= women; meeting2++) {
                count++;
                if (count > tables) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", meeting, meeting2);
            }
        }

    }

}
