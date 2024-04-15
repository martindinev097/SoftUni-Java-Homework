import java.util.Scanner;

public class SchoolCamp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String gender = scan.nextLine();
        int studentCount = Integer.parseInt(scan.nextLine());
        int nightStay = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        if (season.equals("Spring")) {
            if (gender.equals("boys") || gender.equals("girls")) {
                price = nightStay * studentCount * 7.2;
            } else if (gender.equals("mixed")) {
                price = nightStay * studentCount * 9.5;
            }
        } else if (season.equals("Summer")) {
            if (gender.equals("boys") || gender.equals("girls")) {
                price = nightStay * studentCount * 15;
            } else if (gender.equals("mixed")) {
                price = nightStay * studentCount * 20;
            }
        } else if (season.equals("Winter")) {
            if (gender.equals("boys") || gender.equals("girls")) {
                price = nightStay * studentCount * 9.6;
            } else if (gender.equals("mixed")) {
                price = nightStay * studentCount * 10;
            }
        }

        if (studentCount >= 50) {
            price = price * 0.5;
        } else if (studentCount >= 20) {
            price = price * 0.85;
        } else if (studentCount > 10) {
            price = price * 0.95;
        }

        if (gender.equals("girls") && season.equals("Spring")) {
            System.out.printf("Athletics %.2f lv.", price);
        } else if (gender.equals("girls") && season.equals("Summer")) {
            System.out.printf("Volleyball %.2f lv.", price);
        } else if (gender.equals("girls") && season.equals("Winter")) {
            System.out.printf("Gymnastics %.2f lv.", price);
        } else if (gender.equals("boys") && season.equals("Spring")) {
            System.out.printf("Tennis %.2f lv.", price);
        } else if (gender.equals("boys") && season.equals("Summer")) {
            System.out.printf("Football %.2f lv.", price);
        } else if (gender.equals("boys") && season.equals("Winter")) {
            System.out.printf("Judo %.2f lv.", price);
        } else if (gender.equals("mixed") && season.equals("Spring")) {
            System.out.printf("Cycling %.2f lv.", price);
        } else if (gender.equals("mixed") && season.equals("Summer")) {
            System.out.printf("Swimming %.2f lv.", price);
        } else if (gender.equals("mixed") && season.equals("Winter")) {
            System.out.printf("Ski %.2f lv.", price);
        }

    }
}