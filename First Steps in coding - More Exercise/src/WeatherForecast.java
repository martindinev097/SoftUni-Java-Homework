import java.util.Objects;
import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String forecast = scan.nextLine();

        if (Objects.equals(forecast, "sunny")) {

            System.out.println("It's warm outside");
        }
        else {

            System.out.println("It's cold outside");

        }

    }

}
