import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int pagesToRead = pagesCount / pagesPerHour;
        int hoursNeeded = pagesToRead / days;

        System.out.print(hoursNeeded);

    }

}
