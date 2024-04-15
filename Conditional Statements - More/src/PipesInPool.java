import java.util.Scanner;

public class PipesInPool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int area = Integer.parseInt(scan.nextLine());
        int firstPipeLitresPerHour = Integer.parseInt(scan.nextLine());
        int secondPipeLitresPerHour = Integer.parseInt(scan.nextLine());
        double employeeBreakTime = Double.parseDouble(scan.nextLine());

        double areaFilled = employeeBreakTime * (firstPipeLitresPerHour + secondPipeLitresPerHour);
        double percentageFirstPipe = employeeBreakTime * firstPipeLitresPerHour / areaFilled * 100;
        double percentageSecondPipe = employeeBreakTime * secondPipeLitresPerHour / areaFilled * 100;
        double allPercentage = areaFilled / area * 100;
        if (area >= areaFilled) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", allPercentage, percentageFirstPipe, percentageSecondPipe);
        } else {
            areaFilled = areaFilled - area;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", employeeBreakTime, areaFilled);
        }

    }

}
