import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if(fruit.equals("banana")) {
                    System.out.printf("%.2f", 2.5 * quantity);
                } else if(fruit.equals("apple")) {
                    System.out.printf("%.2f", 1.2 * quantity);
                } else if(fruit.equals("orange")) {
                    System.out.printf("%.2f", 0.85 * quantity);
                } else if(fruit.equals("grapefruit")) {
                    System.out.printf("%.2f", 1.45 * quantity);
                } else if(fruit.equals("kiwi")) {
                    System.out.printf("%.2f", 2.7 * quantity);
                } else if(fruit.equals("pineapple")) {
                    System.out.printf("%.2f", 5.5 * quantity);
                } else if(fruit.equals("grapes")) {
                    System.out.printf("%.2f", 3.85 * quantity);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", 2.7 * quantity);
                        break;
                    case "apple":
                        System.out.printf("%.2f", 1.25 * quantity);
                        break;
                    case "orange":
                        System.out.printf("%.2f", 0.9 * quantity);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", 1.6 * quantity);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", 3 * quantity);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", 5.6 * quantity);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", 4.2 * quantity);
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }

}
