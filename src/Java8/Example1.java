package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Convert a List of Strings to uppercase using streams.
public class Example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grapes", "date");
        List<String> uppercaseList = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());

                System.out.println(uppercaseList);
            }
        }
