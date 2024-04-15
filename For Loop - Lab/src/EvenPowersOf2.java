import java.util.Scanner;

public class EvenPowersOf2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i += 2) {
            System.out.println(Math.pow(2, i));
        }

    }

}
