import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double celsius = Double.parseDouble(scan.nextLine());

        double fahrenheit = celsius * ((double) 9 / 5) + 32;

        System.out.printf("%.2f", fahrenheit);

    }

}
