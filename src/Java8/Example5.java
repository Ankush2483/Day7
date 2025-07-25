package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find the first non-repeated character in a string using streams.
public class Example5 {
    public static void main(String[] args) {
        String Input = "ILoveJava";
        Map<String , List<String>> FindFirstNonRepeated = Arrays.stream(Input.split(""))
                .collect(Collectors.groupingBy(s -> s));
        System.out.println(FindFirstNonRepeated);





    }
}
