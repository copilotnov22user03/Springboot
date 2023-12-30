package demo.sample.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class SampleRepository {

//list of 10 employees in static array
    private static List<Employee> employees = new ArrayList<Employee>();

    static {
        employees.add(new Employee(1, "Raj", "IT"));
        employees.add(new Employee(2, "Ravi", "IT"));
        employees.add(new Employee(3, "Ramesh", "IT"));
        employees.add(new Employee(4, "Rajesh", "IT"));
        employees.add(new Employee(5, "Rahul", "IT"));
        employees.add(new Employee(6, "Raj", "IT"));
        employees.add(new Employee(7, "Ravi", "IT"));
        employees.add(new Employee(8, "Ramesh", "IT"));
        employees.add(new Employee(9, "Rajesh", "IT"));
        employees.add(new Employee(10, "Rahul", "IT"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst().get();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(Employee employee, int id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            if (emp.getId() == id) {
                employees.set(i, employee);
                return;
            }
        }
    }

    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
    }

}
