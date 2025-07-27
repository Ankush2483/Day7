package Java8.Day7.src.Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Use constructor reference to create a list of Employee objects from a list of names.
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}
class Example12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("manu", "anku", "ayushi", "mukul", "sheetal");

        List<Employee> employees = names.stream()
                .map(Employee::new)  // Constructor reference
                .collect(Collectors.toList());

        System.out.println(employees);
    }
}
