package Java8.Day7.src.Java8;
//Use Predicate<String> to filter names longer than 5 characters.
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Example13{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ANku", "Aleena", "mukul", "Surrender", "chandu");

        Predicate<String> isLongerThanFive = name -> name.length() > 5;
        List<String> filteredNames = names.stream()
                .filter(isLongerThanFive)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
