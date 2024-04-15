import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int column = Integer.parseInt(scan.nextLine());

        double premierePrice = 12.0;
        double normalPrice = 7.5;
        double discountPrice = 5.0;

        switch(name) {
            case "Premiere":
                System.out.printf("%.2f leva", (row * column * premierePrice));
                break;
            case "Normal":
                System.out.printf("%.2f leva", (row * column * normalPrice));
                break;
            case "Discount":
                System.out.printf("%.2f leva", (row * column * discountPrice));
                break;
        }

    }

}
