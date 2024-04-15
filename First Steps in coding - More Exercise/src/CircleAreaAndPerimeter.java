import java.util.Scanner;

public class CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());

        double volume = r * r * Math.PI;
        double d =  2 * r;
        double perimeter = d * Math.PI;

        System.out.printf("%.2f%n", volume);
        System.out.printf("%.2f", perimeter);

    }

}
