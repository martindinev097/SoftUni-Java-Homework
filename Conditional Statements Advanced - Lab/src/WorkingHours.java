import java.util.Scanner;

public class WorkingHours {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        String dayOfWeek = scan.nextLine();

        switch(dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if(hour >= 10 && hour <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
                
        }

    }

}
