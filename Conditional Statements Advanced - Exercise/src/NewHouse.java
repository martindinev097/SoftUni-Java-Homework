import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String flowerType = scan.nextLine();
        int flowerCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double totalSumRose = flowerCount * 5.0;
        double totalSumDalia = flowerCount * 3.8;
        double totalSumTulip = flowerCount * 2.8;
        double totalSumNarcis = flowerCount * 3.0;
        double totalSumGladiola = flowerCount * 2.5;

        if(flowerType.equals("Roses") && flowerCount < 80 && budget >= totalSumRose) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumRose));
        } else if(budget < totalSumRose){
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumRose - budget);
        }

        if(flowerType.equals("Dahlias") && flowerCount < 90 && budget >= totalSumRose) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumDalia));
        } else if(budget < totalSumDalia){
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumDalia - budget);
        }

        if(flowerType.equals("Tulips") && flowerCount < 80 && budget >= totalSumTulip) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumTulip));
        } else if(budget < totalSumTulip){
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumTulip - budget);
        }

        if(flowerType.equals("Narcissus") && flowerCount < 120 && budget >= totalSumNarcis) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumNarcis));
        } else if(budget < totalSumNarcis){
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumNarcis - budget);
        }

        if(flowerType.equals("Gladiolus") && flowerCount < 80 && budget >= totalSumGladiola) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumGladiola));
        } else if(budget < totalSumGladiola){
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumGladiola - budget);
        }

        switch(flowerType) {


            case "Roses":
                if(flowerCount > 80 && budget >= totalSumRose) {
                    totalSumRose = totalSumRose * 0.9;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumRose));
                } else if(flowerCount > 80 && budget < totalSumRose) {
                    System.out.printf("Not enough money, you need %.2f leva more.", totalSumRose - budget);
                }
                break;
            case "Dahlias":
                if(flowerCount > 90 && budget >= totalSumDalia) {
                    totalSumDalia = totalSumDalia * 0.85;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumDalia));
                } else if(flowerCount > 90 && budget < totalSumDalia) {
                    System.out.printf("Not enough money, you need %.2f leva more.", totalSumDalia - budget);
                }
                break;
            case "Tulips":
                if(flowerCount > 80 && budget >= totalSumTulip) {
                    totalSumTulip = totalSumTulip * 0.85;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumTulip));
                } else if(flowerCount > 80 && budget < totalSumTulip) {
                    System.out.printf("Not enough money, you need %.2f leva more.", totalSumTulip - budget);
                }
                break;
            case "Narcissus":
                if(flowerCount < 120 && budget >= totalSumNarcis) {
                    totalSumNarcis = totalSumNarcis * 1.15;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumNarcis));
                } else if(flowerCount < 120 && budget < totalSumNarcis) {
                    System.out.printf("Not enough money, you need %.2f leva more.", totalSumNarcis - budget);
                }
                break;
            case "Gladiolus":
                if(flowerCount < 80 && budget >= totalSumGladiola) {
                    totalSumGladiola = totalSumGladiola * 1.2;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, (budget - totalSumGladiola));
                } else if(flowerCount < 80 && budget < totalSumGladiola) {
                    System.out.printf("Not enough money, you need %.2f leva more.", totalSumGladiola - budget);
                }
                break;

        }

    }

}