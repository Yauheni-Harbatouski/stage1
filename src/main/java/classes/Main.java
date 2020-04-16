package classes;

/**
 * Patient: id, Surname, Name, Middle name, Address, Phone, Medical card number, Diagnosis.
 *   Create an array of objects. Output:
 *   a) a list of patients with this diagnosis;
 *   b) a list of patients whose medical card number is in the specified interval.
 */
public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();

        operations.addPatient(new Patient("Petrov", "Dmitrii", "Nikolaevich", "Gomel", "45-35-52", 1, "Skarlotina"));
        operations.addPatient(new Patient("Sidorov", "Valentin", "Petrovich", "Gomel", "55-56-53", 2, "Angina"));
        operations.addPatient(new Patient("Ivanov", "Ivan", "Evgenievich", "Dobrush", "65-57-54", 3, "Pnevmonia"));
        operations.addPatient(new Patient("Lisovec", "Nikolay", "Ivanovich", "Minsk", "75-52-55", 4, "Angina"));
        operations.addPatient(new Patient("Denisenko", "Vasiliy", "Mihailovich", "Gomel", "85-54-56", 5, "Diabet"));
        operations.addPatient(new Patient("Leshenko", "Natalia", "Ivanovna", "Gomel", "25-55-57", 6, "Skarlotina"));

        operations.printPatients();
        operations.printByDiagnosis("Angina");
        operations.printByCardNumberRange(2, 3);
        
    }
}
