package Java8.Day7.src.Java8;
//Use Function<String, Integer> to convert string to length and apply it to a list.
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
class Example15 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Red", "ballon", "Strawberry");
        Function<String, Integer> stringToLength = str -> str.length();
        List<Integer> lengths = names.stream()
                .map(stringToLength)
                .collect(Collectors.toList());

        System.out.println(lengths);
    }
}