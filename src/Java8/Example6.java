package Java8.Day7.src.Java8;
//Given a list of numbers, return the square of each distinct number sorted.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Example6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 2, 4, -3, -2, 1);

        List<Integer> result = numbers.stream()
                .distinct()
                .map(n -> n * n)
                .sorted()  // ascending order
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
