package Java8.Day7.src.Java8;
import java.util.*;
import java.util.stream.Collectors;

//Sort a list of employees by salary in descending order using streams
public class Example4 {
    public static String Employee(String Employee, int salary) {
        List<String> list = new ArrayList<>();
        list.add(Employee("Roshan", 20000));
        list.add(Employee("Danish", 40000));
        list.add(Employee("Anush", 30000));
        list.add(Employee("Jam", 50000));
        list.add(Employee("Anu", 60000));
        list.add(Employee("Cherry", 50000));

        return Employee;

    }


    public static void main(String[] args) {

//
//    List<Employee> sorted = employees.stream()
//            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//            .collect(Collectors.toList());
//
//        sorted.forEach(System.out::println);

}
}




