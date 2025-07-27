package Java8.Day7.src.Java8;
import java.util.function.Predicate;
//Combine two Predicate<Integer> to check if a number is positive and even.

class Example16{
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);
        int number = 4;
        if (isPositiveAndEven.test(number)) {
            System.out.println(number + " is positive and even.");
        } else {
            System.out.println(number + " is not positive and even.");
        }
    }
}