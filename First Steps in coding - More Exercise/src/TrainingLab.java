import java.util.Scanner;

public class TrainingLab {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double widthDesk = 0.7;
        double widthCapacity = h - 1;
        double widthAllCap = widthCapacity / widthDesk;
        int y = (int) widthAllCap;

        double lengthDesk = 1.2;
        double lengthAllCap = w / lengthDesk;
        int z = (int) lengthAllCap;

        int totalCap = (y * z) - 3;

        System.out.println(totalCap);

    }

}
