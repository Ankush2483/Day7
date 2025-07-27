package Java8.Day7.src.Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Use method reference to convert a list of strings to uppercase.
class Example11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("manu", "anku", "ayushi", "mukul", "sheetal");

        List<String> uppercased = names.stream()
                .map(String::toUpperCase)  // <-- method reference
                .collect(Collectors.toList());

        System.out.println(uppercased);
    }
}
