package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of names, count how many names start with the letter 'A'.
public class Example3 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Ankush","Ayush","Deepak","Roshan","Manu");
        List<String> toFindStartWithA = lst.stream().filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(toFindStartWithA);



    }
}
