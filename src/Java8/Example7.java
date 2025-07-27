package Java8.Day7.src.Java8;

import java.util.Arrays;
import java.util.List;

//Find the longest string from a list using Stream API.
public class Example7{
    public static void main(String[] args) {

        List<String> str = Arrays.asList("apple", "banana", "strawberry", "kiwi", "pineapple","microservice");
        String Longeststring = str.stream().reduce((word1,word2) -> word1.length() > word2.length()? word1:word2)
                .get();
        System.out.println(Longeststring);

    }
}