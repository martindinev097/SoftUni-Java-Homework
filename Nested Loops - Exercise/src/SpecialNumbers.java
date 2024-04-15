import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        for (int start = 1111; start <= 9999; start++) {
            String digit = Integer.toString(start);

            int num = 0;

            for (int position = 0; position < digit.length(); position++) {

                int currentDigit = Integer.parseInt(String.valueOf(digit.charAt(position)));
                if (currentDigit == 0) {
                    num = 0;
                    break;
                }
                if (N % currentDigit == 0) {
                    num = start;
                } else {
                    num = 0;
                    break;
                }
            }

            if (num == start) {
                System.out.printf("%d ", num);
            }

        }
    }

}