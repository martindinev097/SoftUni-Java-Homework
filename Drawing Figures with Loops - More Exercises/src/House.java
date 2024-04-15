import java.util.Scanner;

public class House {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int starsCountEven = 4;
        int starsCountOdd = 3;

        for (int roof = 1; roof <= (n + 1) / 2; roof++) {
            if (roof == 1) {
                if (n % 2 != 0) {
                    for (int dash = 1; dash <= (n - 1) / 2; dash++) {
                        System.out.print("-");
                    }

                    System.out.print("*");

                    for (int dash = 1; dash <= (n - 1) / 2; dash++) {
                        System.out.print("-");
                    }
                }
                if (n % 2 == 0) {
                    for (int dash = 1; dash <= (n - 2) / 2; dash++) {
                        System.out.print("-");
                    }

                    System.out.print("**");

                    for (int dash = 1; dash <= (n - 2) / 2; dash++) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            if (n % 2 != 0 && roof > 1){
                for (int dash = 1; dash <= (n - starsCountOdd) / 2; dash++) {
                    System.out.print("-");
                }
                for (int stars = 1; stars <= starsCountOdd; stars++) {
                    System.out.print("*");
                    starsCountEven++;
                }
                for (int dash = 1; dash <= (n - starsCountOdd) / 2; dash++) {
                    System.out.print("-");
                }
                starsCountOdd += 2;
                System.out.println();
            }
            if (n % 2 == 0 && roof > 1) {
                for (int dash = 1; dash <= (n - starsCountEven) / 2; dash++) {
                    System.out.print("-");
                }
                for (int stars = 1; stars <= starsCountEven; stars++) {
                    System.out.print("*");
                }
                for (int dash = 1; dash <= (n - starsCountEven) / 2; dash++) {
                    System.out.print("-");
                }
                starsCountEven += 2;
                System.out.println();
            }
        }
        for (int bottom = 1; bottom <= n / 2; bottom++) {
            System.out.print("|");

            for (int stars = 1; stars <= n - 2; stars++) {
                System.out.print("*");
            }

            System.out.print("|");

            System.out.println();
        }

    }

}