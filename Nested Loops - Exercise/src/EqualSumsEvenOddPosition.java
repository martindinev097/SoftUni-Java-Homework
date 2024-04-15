import java.util.Scanner;

public class EqualSumsEvenOddPosition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        for (int currentNum = n1; currentNum <= n2; currentNum++) {
            //String textNumber = currentNum + "";
            //String textNumber = String.valueOf(currentNum);
            String textNumber = Integer.toString(currentNum);

            int evenPosition = 0;
            int oddPosition = 0;

            for (int position = 0; position <= textNumber.length() - 1; position++) {
                int currentDigit = Integer.parseInt(String.valueOf(textNumber.charAt(position)));

                if (position % 2 == 0) {
                    evenPosition += currentDigit;
                } else {
                    oddPosition += currentDigit;
                }

            }

            if (evenPosition == oddPosition) {
                System.out.printf("%d ", currentNum);
            }

        }

    }

}
