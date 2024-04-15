import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double excess = Double.parseDouble(scan.nextLine());

        double capacity = length * width * height;
        double capacityInL = capacity / 1000;
        double allCapacity = capacityInL * (1 - (excess / 100));

        System.out.println(allCapacity);



    }

}
