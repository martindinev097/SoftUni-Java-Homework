public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i1 = 1; i1 <= 10; i1++) {
            for (int i2 = 1; i2 <= 10; i2++) {
                int i3 = i1 * i2;
                System.out.printf("%d * %d = %d%n", i1, i2, i3);
            }
        }

    }

}