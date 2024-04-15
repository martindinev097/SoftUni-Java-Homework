import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String reverseInput = "";

        for (int position = input.length() - 1; position >= 0 ; position--) {
            char currentChar = input.charAt(position);
            String currentLetter = String.valueOf(currentChar);

            reverseInput = reverseInput + currentLetter;
        }

        System.out.println(reverseInput);

    }

}
