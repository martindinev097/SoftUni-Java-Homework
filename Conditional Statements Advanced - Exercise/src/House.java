import java.util.Scanner;

public class House {

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

        double discountRose = totalSumRose * 0.9;
        double discountDalia = totalSumDalia * 0.85;
        double discountTulip = totalSumTulip * 0.85;
        double discountNarcis = totalSumNarcis * 1.15;
        double discountGladiola = totalSumGladiola * 1.20;

        if(flowerType.equals("Roses") && flowerCount > 80 && budget >= discountRose) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - discountRose);
        } else if(flowerType.equals("Roses") && budget >= totalSumRose && flowerCount <= 80) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalSumRose);
        } else if(flowerType.equals("Roses") && budget < totalSumRose && flowerCount <= 80) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumRose - budget);
        } else if(flowerType.equals("Roses") && flowerCount > 80 && budget < discountRose) {
            System.out.printf("Not enough money, you need %.2f leva more.", discountRose - budget);
        }

        if(flowerType.equals("Dahlias") && flowerCount > 90 && budget >= discountDalia) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - discountDalia);
        } else if(flowerType.equals("Dahlias") && flowerCount <= 90 && budget >= totalSumDalia) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalSumDalia);
        } else if(flowerType.equals("Dahlias") && budget < totalSumDalia && flowerCount <= 90) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumDalia - budget);
        } else if(flowerType.equals("Dahlias") && flowerCount > 90 && budget < discountDalia) {
            System.out.printf("Not enough money, you need %.2f leva more.", discountDalia - budget);
        }

        if(flowerType.equals("Tulips") && flowerCount > 80 && budget >= discountTulip) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - discountTulip);
        } else if(flowerType.equals("Tulips") && flowerCount <= 80 && budget >= totalSumTulip) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalSumTulip);
        } else if(flowerType.equals("Tulips") && budget < totalSumTulip && flowerCount <= 80) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumTulip - budget);
        } else if(flowerType.equals("Tulips") && flowerCount > 80 && budget < discountTulip) {
            System.out.printf("Not enough money, you need %.2f leva more.", discountTulip - budget);
        }

        if(flowerType.equals("Narcissus") && flowerCount < 120 && budget >= discountNarcis) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - discountNarcis);
        } else if(flowerType.equals("Narcissus") && flowerCount >= 120 && budget >= totalSumNarcis) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalSumNarcis);
        } else if(flowerType.equals("Narcissus") && budget < totalSumNarcis && flowerCount >= 120) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumNarcis - budget);
        } else if(flowerType.equals("Narcissus") && flowerCount < 120 && budget < discountNarcis) {
            System.out.printf("Not enough money, you need %.2f leva more.", discountNarcis - budget);
        }

        if(flowerType.equals("Gladiolus") && flowerCount < 80 && budget >= discountGladiola) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - discountGladiola);
        } else if(flowerType.equals("Gladiolus") && flowerCount >= 80 && budget >= totalSumGladiola) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalSumGladiola);
        } else if(flowerType.equals("Gladiolus") && budget < totalSumGladiola && flowerCount >= 80) {
            System.out.printf("Not enough money, you need %.2f leva more.", totalSumGladiola - budget);
        } else if(flowerType.equals("Gladiolus") && flowerCount < 80 && budget < discountGladiola) {
            System.out.printf("Not enough money, you need %.2f leva more.", discountGladiola - budget);
        }

    }

}
