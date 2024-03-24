package comparableAndComparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        Employee emp1 = new Employee(100, "Artyom", "Badoyan", 12345);
        Employee emp2 = new Employee(15, "Narine", "Martirosyan", 2354);
        Employee emp3 = new Employee(123, "Karen", "Simonyan", 8546);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("перед сортировки id: " + list);
        Collections.sort(list, new IdComparator());
        System.out.println("после сортировки id: " + list);
        System.out.println();

        System.out.println("перед сортировки name: " + list);
        Collections.sort(list, new NameComparator());
        System.out.println("после сортировки name: " + list);
        System.out.println();

        System.out.println("перед сортировки salary: " + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("после сортировки salary: " + list);
    }
}
