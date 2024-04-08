package collection.binarySearch;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.id - employee.id;
        if (result == 0) {
            result = this.name.compareTo(employee.name);
        }
        return result;
    }
}
