package fundamentals.maintask;

import java.util.*;

public class Utility {
    private final Scanner scanner = new Scanner(System.in);


    void sayHello() {
        System.out.println("Print your name..");
        String name = scanner.next();
        System.out.println("Hello, " + name);
    }

    void printArgsInReverseOrder() {
        List args = enterArgumentsToList();
        Collections.reverse(args);
        System.out.println("Reversed: " + args);
    }

    void printRandomNumbers() {
        Random random = new Random();
        int count = 0;

        System.out.println("Enter the count of random numbers:");

        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
        }

        System.out.println("random numbers in line:");
        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println("\nrandom numbers with line break:");

        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt(100));
        }
    }

    void pickAndPrintMonth() {
        int monthNumber = 0;
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        if (scanner.hasNextInt()) {
            monthNumber = scanner.nextInt();
        }
        if (monthNumber > 0 && monthNumber <= 12)
            System.out.println(months.get(monthNumber - 1));
        else System.out.println("Error! Month number not included in the limit [1..12]");
    }


    void printSumAndProduct() {
        List integers = enterIntegersToList();
        int sum = 0;
        int product = 1;
        for (Object number : integers) {
            sum += (int) number;
            product *= (int) number;
        }
        System.out.println("Product of numbers: " + product + "\nSum of numbers: " + sum);
    }


    public List<Integer> enterIntegersToList() {
        int numberInt = 0;
        System.out.println("Enter the required number of integers..");

        if (scanner.hasNextInt()) {
            numberInt = scanner.nextInt();
        }

        List<Integer> listInt = new ArrayList<>(numberInt+1);

        for (int i = 0; i < numberInt; i++) {
            System.out.println("enter integer № " + (i + 1) + ":");
            if (scanner.hasNextInt()) {
                listInt.add(scanner.nextInt());
            }
        }
        return listInt;
    }


    private List<String> enterArgumentsToList() {
        int numberArgs = 0;
        System.out.println("Enter the required number of arguments..");

        if (scanner.hasNextInt()) {
            numberArgs = scanner.nextInt();
        }

        List<String> listArgs = new ArrayList<>(numberArgs+1);

        for (int i = 0; i < numberArgs; i++) {
            System.out.println("enter argument № " + (i + 1) + ":");
            if (scanner.hasNext()) {
                listArgs.add(scanner.next());
            }
        }
        return listArgs;
    }

    int selectTask() {
        int taskNumber = 0;
        final List<String> TASKS_ANNOTATIONS = Arrays.asList(
                "Program stopped",
                "Task 1: Greet any user by entering their name through the command line.",
                "Task 2. Display the command line arguments in the reverse order in the console window.",
                "Task 3. Print a given number of random numbers with and without a line break",
                "Task 4. Enter integers as command line arguments, calculate their sum (product) and print the result to the console.",
                "Task 5. Enter a number from 1 to 12. Display on the console the name of the month corresponding to this date. " +
                        "Check the correctness of the input of numbers.");


        System.out.println("Please, enter the task number in the console [1..5], or 0 for exit:");

        if (scanner.hasNextInt()) {
            taskNumber = scanner.nextInt();
        }

        if (taskNumber >= 0 && taskNumber <= 5)
            System.out.println(TASKS_ANNOTATIONS.get(taskNumber));
        else System.out.println("Invalid number");

        return taskNumber;
    }
}
