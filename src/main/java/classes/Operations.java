package classes;

import java.util.Arrays;
import java.util.Objects;

class Operations {

    private static Patient[] patients = new Patient[10];


    void addPatient(Patient patient) {

        for (int i = 0; i < patients.length; i++) {
            if (patients[patients.length - 1] != null)
                arrayGrow();
            if (patients[i] != null) continue;
            patients[i] = patient;
            break;
        }
    }

    public void printByCardNumberRange(int from, int to) {
        System.out.println("\nprinting patients by card number range:" + " from " + from + " to " + to);
        for (Patient patient : patients) {
            if (patient == null) continue;
            if (patient.getCardNumber() >= from && patient.getCardNumber() <= to)
                System.out.println(patient);
        }
    }

    public void printByDiagnosis(String value) {
        System.out.println("\nprinting patients by diagnosis: " + value);
        for (Patient patient : patients) {
            if (patient != null && patient.getDiagnosis().equals(value))
                System.out.println(patient);
        }
    }

    public void printPatients() {
        System.out.println("printing patients:");
        Arrays.stream(patients).filter(Objects::nonNull).forEach(System.out::println);
    }

    private void arrayGrow() {
        patients = Arrays.copyOf(patients, patients.length * 2);
    }

}
