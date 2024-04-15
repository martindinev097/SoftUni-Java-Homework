import java.util.Scanner;

public class Messages {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= count; row++) {
            int number = Integer.parseInt(scan.nextLine());

            String numToStr = String.valueOf(number);
            int length = numToStr.length();

            char digits = numToStr.charAt(0);

            if (digits == '2') {
                if (length == 1) {
                    System.out.print("a");
                } else if (length == 2) {
                    System.out.print("b");
                } else if (length == 3) {
                    System.out.print("c");
                }
            } else if (digits == '3') {
                if (length == 1) {
                    System.out.print("d");
                } else if (length == 2) {
                    System.out.print("e");
                } else if (length == 3) {
                    System.out.print("f");
                }
            } else if (digits == '4') {
                if (length == 1) {
                    System.out.print("g");
                } else if (length == 2) {
                    System.out.print("h");
                } else if (length == 3) {
                    System.out.print("i");
                }
            } else if (digits == '5') {
                if (length == 1) {
                    System.out.print("j");
                } else if (length == 2) {
                    System.out.print("k");
                } else if (length == 3) {
                    System.out.print("l");
                }
            } else if (digits == '6') {
                if (length == 1) {
                    System.out.print("m");
                } else if (length == 2) {
                    System.out.print("n");
                } else if (length == 3) {
                    System.out.print("o");
                }
            } else if (digits == '7') {
                if (length == 1) {
                    System.out.print("p");
                } else if (length == 2) {
                    System.out.print("q");
                } else if (length == 3) {
                    System.out.print("r");
                } else if (length == 4) {
                    System.out.print("s");
                }
            } else if (digits == '8') {
                if (length == 1) {
                    System.out.print("t");
                } else if (length == 2) {
                    System.out.print("u");
                } else if (length == 3) {
                    System.out.print("v");
                }
            } else if (digits == '9') {
                if (length == 1) {
                    System.out.print("w");
                } else if (length == 2) {
                    System.out.print("x");
                } else if (length == 3) {
                    System.out.print("y");
                } else if (length == 4) {
                    System.out.print("z");
                }
            } else if (digits == '0') {
                System.out.print(" ");
            }

        }

    }

}
