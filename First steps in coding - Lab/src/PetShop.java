import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int foodDogs = Integer.parseInt(scan.nextLine());
        int foodCats = Integer.parseInt(scan.nextLine());

        double foodDogsPrice = 2.50;
        int foodCatsPrice = 4;

        double DogsPriceTotal = foodDogs * foodDogsPrice;
        int CatsPriceTotal = foodCats * foodCatsPrice;

        double totalSum = DogsPriceTotal + CatsPriceTotal;

        System.out.println(totalSum);

    }

}
