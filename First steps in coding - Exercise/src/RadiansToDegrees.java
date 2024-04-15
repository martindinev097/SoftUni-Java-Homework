import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radianAngle = Double.parseDouble(scan.nextLine());

        double degree = radianAngle * (180 / Math.PI);

        System.out.print(degree);

    }

}
