import java.util.Scanner;

public class EqualPairs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int totalValue = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int maxDifference = 0;
        int prevNumber1 = 0;
        int prevNumber2 = 0;

        for (int i = 1; i <= num; i++) {
            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            totalValue += number1 + number2;

            int doubleSum = number1 + number2;

            if (doubleSum > maxValue) {
                maxValue = doubleSum;
            }

            if (doubleSum < minValue) {
                minValue = doubleSum;
            }

            if (i > 1) {
                int currentDifference = Math.abs(doubleSum - (prevNumber1 + prevNumber2));
                if (currentDifference > maxDifference) {
                    maxDifference = currentDifference;
                }
            }

            prevNumber1 = number1;
            prevNumber2 = number2;

        }

        if (totalValue / num == num) {
            System.out.println("Yes, value="+num);
        } else if (maxValue == totalValue) {
            System.out.println("Yes, value="+totalValue);
        } else if (maxValue == minValue) {
            System.out.println("Yes, value="+maxValue);
        }

        if (maxValue != minValue) {
            int diff = maxValue - minValue;
            System.out.println("No, maxdiff=" + maxDifference);
        }

    }

}
