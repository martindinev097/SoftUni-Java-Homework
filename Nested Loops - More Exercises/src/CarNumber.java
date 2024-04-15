import java.util.Scanner;

public class CarNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int lastNum = Integer.parseInt(scan.nextLine());

        for (int one = firstNum; one <= lastNum; one++) {
            for (int two = firstNum; two <= lastNum; two++) {
                for (int three = firstNum; three <= lastNum; three++) {
                    for (int four = firstNum; four <= lastNum; four++) {
                        if (((one % 2 == 0 && four % 2 != 0) || (four % 2 == 0 && one % 2 != 0)) && one > four && ((two + three) % 2 == 0)) {
                            System.out.printf("%d%d%d%d ", one, two, three, four);
                        }
                    }
                }
            }
        }

    }

}
