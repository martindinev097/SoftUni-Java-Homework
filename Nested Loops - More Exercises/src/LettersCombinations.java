import java.util.Scanner;

public class LettersCombinations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char firstLetter = scan.nextLine().charAt(0);
        char lastLetter = scan.nextLine().charAt(0);
        char letterToNotUse = scan.nextLine().charAt(0);

        int count = 0;

        for (char start = firstLetter; start <= lastLetter; start++) {
            for (char end = firstLetter; end <= lastLetter; end++) {
                for (char end2 = firstLetter; end2 <= lastLetter; end2++) {
                    if (start != letterToNotUse && end != letterToNotUse && end2 != letterToNotUse) {
                        count++;
                        System.out.printf("%c%c%c ", start, end, end2);
                    }
                }
            }
        }

        System.out.print(count);

    }

}
