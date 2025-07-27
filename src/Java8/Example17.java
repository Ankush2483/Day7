package Java8.Day7.src.Java8;
//Use BiFunction<Integer, Integer, Integer> to add two numbers
// and compose with another function to square the result.
import java.util.function.BiFunction;
import java.util.function.Function;

class Example17 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        Function<Integer, Integer> square = x -> x * x;
        int result = add.andThen(square).apply(2, 3); // (2 + 3)^2 = 25

        System.out.println(result);
    }
}
