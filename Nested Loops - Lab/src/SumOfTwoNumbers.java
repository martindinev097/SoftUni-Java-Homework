import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());

        int combinationCount = 0;
        int result = 0;
        int firstNum = 0;
        int secondNum = 0;

        for (int i = start; i <= end; i++) {
            for (int i2 = start; i2 <= end; i2++) {
                combinationCount++;
                result = i + i2;
                if (result == magicNum) {
                    firstNum = i;
                    secondNum = i2;
                    break;
                }
            }

            if (result == magicNum) {
                break;
            }

        }

        if (result == magicNum) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combinationCount, firstNum, secondNum, magicNum);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNum);
        }

    }

}
