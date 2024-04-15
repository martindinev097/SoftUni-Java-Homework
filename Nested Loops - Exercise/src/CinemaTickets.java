import java.util.Scanner;

public class CinemaTickets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();

        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int studentCountS = 0;
        int standardCountS = 0;
        int kidCountS = 0;

        while (!movieName.equals("Finish")) {
            int freeSpaces = Integer.parseInt(scan.nextLine());

            for (int i = 1; i <= freeSpaces; i++) {
                String ticketType = scan.nextLine();

                if (ticketType.equals("End")) {
                    break;
                }

                switch (ticketType) {
                    case "student":
                        studentCount++;
                        studentCountS++;
                        break;
                    case "standard":
                        standardCount++;
                        standardCountS++;
                        break;
                    case "kid":
                        kidCount++;
                        kidCountS++;
                        break;
                }
            }

            double totalSpacesTaken = studentCount + standardCount + kidCount;

            System.out.printf("%s - %.2f%% full.%n", movieName, (totalSpacesTaken / freeSpaces) * 100);

            studentCount = 0;
            standardCount = 0;
            kidCount = 0;

            movieName = scan.nextLine();

        }

        double totalTickets = studentCountS + standardCountS + kidCountS;
        double studentPercentage = studentCountS / totalTickets * 100;
        double standardPercentage = standardCountS / totalTickets * 100;
        double kidPercentage = kidCountS / totalTickets * 100;

        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidPercentage);

    }
}