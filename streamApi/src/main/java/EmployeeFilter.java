import java.time.LocalDate;
import java.util.List;

public interface EmployeeFilter {
    void printMaxSalaries(List<Employee> employeeList);

    void findWomenBirthdate(List<Employee> employeeList, LocalDate date);

    void printInformationMen(List<Employee> employeeList);

    void printSalariesAscending(List<Employee> employeeList);

    void printUniqueSalaries(List<Employee> employeeList);
}