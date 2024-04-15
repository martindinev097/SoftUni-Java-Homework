public class ClockPart2 {

    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            for (int mins = 0; mins < 60; mins++) {
                for (int sec = 0; sec < 60; sec++) {
                    System.out.printf("%d : %d : %d%n", hour, mins, sec);
                }
            }
        }

    }

}
