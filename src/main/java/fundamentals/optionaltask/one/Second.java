package fundamentals.optionaltask.one;

import fundamentals.maintask.Utility;

import java.util.Collections;
import java.util.List;

public class Second {
    private final Utility utility = new Utility();

    public static void main(String[] args) {
        Second second = new Second();
        second.printListAscAndDescOrder();
    }

    private void printListAscAndDescOrder() {
        System.out.println("Task 2: Print the numbers in ascending (descending) values of their length.");
        List<Integer> numbers = utility.enterIntegersToList();
        Collections.sort(numbers);
        System.out.println("ascending: " + numbers);
        Collections.reverse(numbers);
        System.out.println("descending:" + numbers);
    }
}
