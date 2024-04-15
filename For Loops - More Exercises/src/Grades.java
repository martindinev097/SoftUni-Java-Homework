import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int studentCount = Integer.parseInt(scan.nextLine());

        double students23 = 0;
        double students34 = 0;
        double students45 = 0;
        double students56 = 0;
        double totalScore = 0;

        for (int i = 1; i <= studentCount; i++) {
            double score = Double.parseDouble(scan.nextLine());
            totalScore += score;

            if (score < 3) {
                students23++;
            } else if (score < 4) {
                students34++;
            } else if (score < 5) {
                students45++;
            } else {
                students56++;
            }
        }

        double totalStudents = students23 + students34 + students45 + students56;

        System.out.printf("Top students: %.2f%%%n", ((students56 / studentCount) * 100));
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", ((students45 / studentCount) * 100));
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", ((students34 / studentCount) * 100));
        System.out.printf("Fail: %.2f%%%n", ((students23 / studentCount) * 100));
        System.out.printf("Average: %.2f", totalScore / totalStudents);

    }

}
