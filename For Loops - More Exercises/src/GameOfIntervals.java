import java.util.Scanner;

public class GameOfIntervals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int moves = Integer.parseInt(scan.nextLine());
        double score = 0.0;
        double marks09 = 0.0;
        double marks1019 = 0.0;
        double marks2029 = 0.0;
        double marks3039 = 0.0;
        double marks4050 = 0.0;
        double marksInvalid = 0.0;

        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (number >= 0 && number <= 9) {
                score += number * 0.2;
                marks09++;
            } else if (number >= 10 && number <= 19) {
                score += number * 0.3;
                marks1019++;
            } else if (number >= 20 && number <= 29) {
                score += number * 0.4;
                marks2029++;
            } else if (number >= 30 && number <= 39) {
                score +=  50;
                marks3039++;
            } else if (number >= 40 && number <= 50) {
                score += 100;
                marks4050++;
            } else {
                score = score / 2;
                marksInvalid++;
            }

        }

        double totalMarks = marks09 + marks1019 + marks2029 + marks3039 + marks4050 + marksInvalid;

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", ((marks09 / totalMarks) * 100));
        System.out.printf("From 10 to 19: %.2f%%%n", ((marks1019 / totalMarks) * 100));
        System.out.printf("From 20 to 29: %.2f%%%n", ((marks2029 / totalMarks) * 100));
        System.out.printf("From 30 to 39: %.2f%%%n", ((marks3039 / totalMarks) * 100));
        System.out.printf("From 40 to 50: %.2f%%%n", ((marks4050 / totalMarks) * 100));
        System.out.printf("Invalid numbers: %.2f%%%n", ((marksInvalid / totalMarks) * 100));

    }

}
