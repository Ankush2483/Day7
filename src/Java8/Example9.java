package Java8.Day7.src.Java8;
//Partition a list of integers into even and odd numbers using Collectors.partitioningBy.
import java.util.*;
import java.util.stream.Collectors;

class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 7, 8, 10, 13, 15);


        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
