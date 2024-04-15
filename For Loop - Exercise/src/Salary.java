import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        int facebookPenalty = 150;
        int instagramPenalty = 100;
        int redditPenalty = 50;

        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= tabs; i++) {
            String websites = scan.nextLine();

            switch (websites) {
                case "Facebook":
                    salary = salary - facebookPenalty;
                    break;
                case "Instagram":
                    salary = salary - instagramPenalty;
                    break;
                case "Reddit":
                    salary = salary - redditPenalty;
                    break;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            } else if (i == tabs){
                System.out.printf("%d", salary);
            }

        }

    }

}