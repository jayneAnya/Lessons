import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        var emp = new Employee("Jane", 1);
        var mgr = new Manager("Jane", 1, "Sales");

        emp.displayEmployeeDetails();
        mgr.displayEmployeeDetails();


        //Collections and Streams
        var employees = Arrays.asList(
                new Employee("Debby", 2),
                new Employee("John", 3),
                new Employee("Sarah", 4)
        );

        var filteredList = employees.stream()
                .filter(e -> e.getName().startsWith("J"))
                .collect(Collectors.toList());

        filteredList.forEach( e -> System.out.println(e.getName()));

        //Lambda

        Comparator<Employee> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());


    }
}