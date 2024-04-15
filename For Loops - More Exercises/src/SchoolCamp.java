import java.util.Scanner;

public class SchoolCamp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String gender = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        String sport = "";

        switch (season) {
            case "Winter":
                switch (gender) {
                    case "boys":
                    case "girls":
                        if (students < 10){
                            price = students * nights * 9.6;
                        } else if (students < 20) {
                            price = students * (nights * 9.6) * 0.95;
                        } else if (students < 50) {
                            price = students * (nights * 9.6) * 0.85;
                        } else {
                            price = students * (nights * 9.6) * 0.5;
                        }
                        break;
                    case "mixed":
                        if (students < 10){
                            price = students * nights * 10;
                        } else if (students < 20) {
                            price = students * (nights * 10) * 0.95;
                        } else if (students < 50) {
                            price = students * (nights * 10) * 0.85;
                        } else {
                            price = students * (nights * 10) * 0.5;
                        }
                        break;
                }
                break;
            case "Spring":
                switch (gender) {
                    case "boys":
                    case "girls":
                        if (students < 10){
                            price = students * nights * 7.2;
                        } else if (students < 20) {
                            price = students * (nights * 7.2) * 0.95;
                        } else if (students < 50) {
                            price = students * (nights * 7.2) * 0.85;
                        } else {
                            price = students * (nights * 7.2) * 0.5;
                        }
                        break;
                    case "mixed":
                        if (students < 10){
                            price = students * nights * 9.50;
                        } else if (students < 20) {
                            price = students * (nights * 9.50) * 0.95;
                        } else if (students < 50) {
                            price = students * (nights * 9.50) * 0.85;
                        } else {
                            price = students * (nights * 9.50) * 0.5;
                        }
                        break;
                }
                break;
            case "Summer":
                switch (gender) {
                    case "boys":
                    case "girls":
                        if (students < 10) {
                            price = students * nights * 15;
                        } else if (students < 20) {
                            price = students * (nights * 15) * 0.95;
                        } else if (students < 50) {
                            price = students * (nights * 15) * 0.85;
                        } else {
                            price = students * (nights * 15) * 0.5;
                        }
                        break;
                    case "mixed":
                        if (students < 10) {
                            price = students * nights * 20;
                        } else if (students < 20) {
                            price = students * (nights * 20) * 0.95;
                        } else if (students < 50) {
                            price = students * (nights * 20) * 0.85;
                        } else {
                            price = students * (nights * 20) * 0.5;
                        }
                        break;
                }
                break;
        }

        switch (season) {
            case "Winter":
                switch (gender) {
                    case "boys":
                        sport = "Judo";
                        break;
                    case "girls":
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (gender) {
                    case "boys":
                        sport = "Tennis";
                        break;
                    case "girls":
                        sport = "Athletics";
                        break;
                    case "mixed":
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (gender) {
                    case "boys":
                        sport = "Football";
                        break;
                    case "girls":
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        sport = "Swimming";
                        break;
                }
                break;
        }

        System.out.printf("%s %.2f lv.", sport, price);

    }

}
