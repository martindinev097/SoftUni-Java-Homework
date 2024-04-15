import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (city) {
            case "Varna":
                if(item.equals("coffee")) {
                    System.out.println(quantity * 0.45);
                } else if(item.equals("water")) {
                    System.out.println(quantity * 0.7);
                } else if(item.equals("beer")) {
                    System.out.println(quantity * 1.1);
                } else if(item.equals("sweets")) {
                    System.out.println(quantity * 1.35);
                } else if(item.equals("peanuts")) {
                    System.out.println(quantity * 1.55);
                }
                break;
            case "Plovdiv":
                if(item.equals("coffee")) {
                    System.out.println(quantity * 0.40);
                } else if(item.equals("water")) {
                    System.out.println(quantity * 0.7);
                } else if(item.equals("beer")) {
                    System.out.println(quantity * 1.15);
                } else if(item.equals("sweets")) {
                    System.out.println(quantity * 1.30);
                } else if(item.equals("peanuts")) {
                    System.out.println(quantity * 1.50);
                }
                break;
            case "Sofia":
                if(item.equals("coffee")) {
                    System.out.println(quantity * 0.50);
                } else if(item.equals("water")) {
                    System.out.println(quantity * 0.8);
                } else if(item.equals("beer")) {
                    System.out.println(quantity * 1.20);
                } else if(item.equals("sweets")) {
                    System.out.println(quantity * 1.45);
                } else if(item.equals("peanuts")) {
                    System.out.println(quantity * 1.6);
                }
                break;
        }


    }

}
