import java.util.Scanner;

public class PrimePairs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstTwoNumStart = Integer.parseInt(scan.nextLine());
        int secondTwoNumStart = Integer.parseInt(scan.nextLine());
        int diffBetweenStartEndFirstNum = Integer.parseInt(scan.nextLine());
        int diffBetweenStartEndSecondNum = Integer.parseInt(scan.nextLine());

        int firstTwoNumEnd = diffBetweenStartEndFirstNum + firstTwoNumStart;
        int secondTwoNumEnd = diffBetweenStartEndSecondNum + secondTwoNumStart;

        for (int firstPair = firstTwoNumStart; firstPair <= firstTwoNumEnd; firstPair++) {
            for (int secondPair = secondTwoNumStart; secondPair <= secondTwoNumEnd; secondPair++) {
                if (firstPair % 2 != 0 && firstPair % 3 != 0 && firstPair % 5 != 0 && firstPair % 7 != 0) {
                    if (secondPair % 2 != 0 && secondPair % 3 != 0 && secondPair % 5 != 0 && secondPair % 7 != 0) {
                        System.out.printf("%d%d%n", firstPair, secondPair);
                    }
                }
            }
        }

    }

}
