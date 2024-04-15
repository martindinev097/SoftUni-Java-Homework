import java.util.Scanner;

public class FootballLeague {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double stadiumCap = Double.parseDouble(scan.nextLine());
        int allFans = Integer.parseInt(scan.nextLine());

        double fansA = 0.0;
        double fansB = 0.0;
        double fansV = 0.0;
        double fansG = 0.0;

        for (int i = 1; i <= allFans; i++) {
            String sector = scan.nextLine();

            switch (sector) {
                case "A":
                    fansA++;
                    break;
                case "B":
                    fansB++;
                    break;
                case "V":
                    fansV++;
                    break;
                case "G":
                    fansG++;
                    break;
            }
        }

        System.out.printf("%.2f%%%n", ((fansA / allFans) * 100));
        System.out.printf("%.2f%%%n", ((fansB / allFans) * 100));
        System.out.printf("%.2f%%%n", ((fansV / allFans) * 100));
        System.out.printf("%.2f%%%n", ((fansG / allFans) * 100));
        System.out.printf("%.2f%%%n", ((allFans / stadiumCap) * 100));

    }

}
