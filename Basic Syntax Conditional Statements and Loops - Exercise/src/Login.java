import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";
        String passCompare = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentLetter = username.charAt(position);
            password = password + currentLetter;
        }

        for (int tries = 1; tries < 4; tries++) {
            String usernameD = scan.nextLine();

            if (usernameD.equals(password)) {
                System.out.printf("User %s logged in.", username);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        }

        System.out.printf("User %s blocked!", username);

    }
}