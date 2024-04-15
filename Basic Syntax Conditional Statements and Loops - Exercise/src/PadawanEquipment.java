import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());
        double lightsabersPrice = Double.parseDouble(scan.nextLine());
        double robesPrice = Double.parseDouble(scan.nextLine());
        double beltsPrice = Double.parseDouble(scan.nextLine());

        double totalPrice = (Math.ceil(1.1 * countStudents)) * lightsabersPrice + countStudents * robesPrice + countStudents * beltsPrice;

        if (countStudents >= 6) {
            int freeBelts = countStudents / 6;
            totalPrice = totalPrice - (freeBelts * beltsPrice);
        }

        if (moneyAvailable >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - moneyAvailable);
        }

    }

}
