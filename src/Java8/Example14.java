package Java8.Day7.src.Java8;
//Create a custom FunctionalInterface called TriFunction<T, U, V, R>.
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
class Example14 {
    public static void main(String[] args) {
        TriFunction<String, String, String, String> concatThree = (a, b, c) -> a + b + c;

        String result = concatThree.apply("Java", "8", "Anku");
        System.out.println(result);
    }
}