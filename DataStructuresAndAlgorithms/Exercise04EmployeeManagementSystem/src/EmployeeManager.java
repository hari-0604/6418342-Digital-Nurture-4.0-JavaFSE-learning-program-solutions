package Exercise04EmployeeManagementSystem.src;
public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == empId) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployee(int empId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == empId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--count] = null;
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(2, "Bob", "Tester", 50000));
        manager.addEmployee(new Employee(3, "Charlie", "Manager", 75000));

        System.out.println("\nAll Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee emp = manager.searchEmployee(2);
        System.out.println(emp != null ? emp : "Not Found");

        System.out.println("\nDeleting Employee with ID 1:");
        manager.deleteEmployee(1);
        manager.traverseEmployees();
    }
}
