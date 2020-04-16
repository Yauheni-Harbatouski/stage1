package fundamentals.optionaltask.one;

import fundamentals.maintask.Utility;

import java.util.List;
import java.util.stream.Collectors;

public class First {
    private final Utility utility = new Utility();

    public static void main(String[] args) {
        First first = new First();
        first.findShorterAndLargerNumber();
    }

    private void findShorterAndLargerNumber() {
        System.out.println("Task 1: 1. Find the shortest and longest number. Print the found numbers and their length.");
        List<Integer> numbers = utility.enterIntegersToList().stream().sorted().collect(Collectors.toList());
        System.out.println("Shortest int: " + numbers.get(0) + "\nLargest int: " + numbers.get(numbers.size() - 1));
    }

}
