package Java8.Day7.src.Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Flatten a list of lists into a single list using flatMap.
class Person1 {
    private String name;
    private List<String> numbers;

    public Person1(String name, List<String> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return name;
    }
}
class Example10{
    public static void main(String[] args) {

        List<Java8.Day7.src.Java8.Person1> people = Arrays.asList(
                new Java8.Day7.src.Java8.Person1("manu", Arrays.asList("9175654210", "9876543210")),
                new Java8.Day7.src.Java8.Person1("Anku", Arrays.asList("9985664210")),
                new Java8.Day7.src.Java8.Person1("Ayushi", Arrays.asList("9985654210", "9123456789")),
                new Java8.Day7.src.Java8.Person1("mukul", Arrays.asList("9985655010")),
                new Java8.Day7.src.Java8.Person1("sheetal", Arrays.asList("9985656210", "9112233445"))
        );

        List<String> phoneNumbers = people.stream()
                .flatMap(person -> person.getNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(phoneNumbers);

    }
}