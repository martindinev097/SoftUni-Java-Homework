import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int periodForCalculations = Integer.parseInt(scan.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= periodForCalculations; i++) {
            int patientsCount = Integer.parseInt(scan.nextLine());

            if (i % 3 != 0) {
                if (patientsCount <= doctors) {
                    treatedPatients += patientsCount;
                } else {
                    untreatedPatients += (patientsCount - doctors);
                    treatedPatients += doctors;
                }
            }

            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients) {
                    doctors++;
                }
                if (patientsCount <= doctors) {
                    treatedPatients += patientsCount;
                } else {
                    untreatedPatients += patientsCount - doctors;
                    treatedPatients += doctors;
                }
            }

        }

        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");

    }

}
