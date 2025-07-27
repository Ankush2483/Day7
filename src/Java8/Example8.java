package Java8.Day7.src.Java8;
import java.util.*;
import java.util.stream.Collectors;
//Group a list of people by gender (e.g., Map<String, List<Person>>)
class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Example8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("manu", "Female"),
                new Person("Anku", "Male"),
                new Person("Ayushi", "Female"),
                new Person("mukul", "Male"),
                new Person("sheetal", "Female")
        );

        // Grouping by gender
        Map<String, List<Person>> groupedByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));



        groupedByGender.forEach((gender, persons) ->
                System.out.println(gender + ": " + persons));
    }
}
