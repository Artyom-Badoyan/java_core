package collection.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchEmployee {

    public static void main(String[] args) {

        // sort(), binarySearch();

        Employee employee1 = new Employee(100, "Artyom", 12345);
        Employee employee2 = new Employee(15, "Varuj", 2546);
        Employee employee3 = new Employee(123, "Elena", 5214);
        Employee employee4 = new Employee(15, "Karen", 256);
        Employee employee5 = new Employee(182, "Ivan", 6985);
        Employee employee6 = new Employee(15, "Anna", 1023);
        Employee employee7 = new Employee(250, "Artur", 9654);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        System.out.println(employeeList);
        System.out.println("---------------------------");

        Collections.sort(employeeList);
        System.out.println(employeeList);
        System.out.println("---------------------------");

        int indexEmployee = Collections.binarySearch(employeeList, new Employee(123, "Elena", 5214));
        System.out.println(indexEmployee);

    }
}
