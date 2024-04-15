import java.util.Scanner;

public class WeddingSeats {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char lastSector = scan.nextLine().charAt(0);
        int sectorALines = Integer.parseInt(scan.nextLine());
        int oddLineSeatCount = Integer.parseInt(scan.nextLine());
        int evenLineSeatCount = oddLineSeatCount + 2;
        int totalSeats = 0;

        for (char firstSector = 'A'; firstSector <= lastSector; firstSector++) {
            String currentSector = String.valueOf(firstSector);
            if (!currentSector.equals("A")) {
                sectorALines++;
            }
            for (int a = 1; a <= sectorALines; a++) {
                if (a % 2 == 0) {
                    for (char row = 'a'; row < 97 + evenLineSeatCount; row++) {
                        String currentLetter = String.valueOf(row);
                        System.out.printf("%s%d%s%n", currentSector, a, currentLetter);
                        totalSeats++;
                    }
                } else {
                    for (char row = 'a'; row < 97 + oddLineSeatCount; row++) {
                        String currentLetter = String.valueOf(row);
                        System.out.printf("%s%d%s%n", currentSector, a, currentLetter);
                        totalSeats++;
                    }
                }
            }
        }

        System.out.println(totalSeats);

    }

}