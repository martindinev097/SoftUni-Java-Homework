import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if (age >= 16 && gender.equals("m")) {
            System.out.println("Mr.");
        } else if (age < 16 && gender.equals("m")) {
            System.out.println("Master");
        } else if (age >= 16 && gender.equals("f")) {
            System.out.println("Ms.");
        } else if (age < 16 && gender.equals("f")) {
            System.out.println("Miss");
        }

    }

}