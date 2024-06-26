package comparableAndComparator.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.salary - employee2.salary;
    }
}
