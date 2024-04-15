import java.util.Scanner;

public class TrainTheTrainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int referee = Integer.parseInt(scan.nextLine());

        String presentation = scan.nextLine();

        double average = 0;
        double scoreTotal = 0;
        double averageTotal = 0;
        double presentationNum = 0;

        while (!presentation.equals("Finish")) {

            for (int i = 1; i <= referee; i++) {
                double scores = Double.parseDouble(scan.nextLine());
                scoreTotal += scores;
                average = scoreTotal / referee;
            }

            System.out.printf("%s - %.2f.%n", presentation, average);

            presentationNum++;
            averageTotal += average;

            scoreTotal = 0;
            average = 0;

            presentation = scan.nextLine();

        }

        System.out.printf("Student's final assessment is %.2f.", averageTotal / presentationNum);

    }

}