import java.util.Scanner;

public class ForeignLanguages {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();

        if (country.equals("England") || country.equals("USA")) {
            System.out.println("English");
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }

    }

}
