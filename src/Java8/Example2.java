package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter a list of integers to get only even numbers using Stream API.
public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> toEvenNumber = list.stream().map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(toEvenNumber);

}
}
