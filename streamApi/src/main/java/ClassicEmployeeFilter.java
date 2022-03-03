import java.time.LocalDate;
import java.util.List;

public class ClassicEmployeeFilter implements EmployeeFilter {

    private Employee emp;

    @Override
    public void printMaxSalaries(List<Employee> employeeList) {

        for (int i = 0; i < employeeList.toArray().length; i++) {
            if (emp.getSalary() > employeeList.toArray()[i])
        }
    }

    @Override
    public void findWomenBirthdate(List<Employee> employeeList, LocalDate date) {

    }

    @Override
    public void printInformationMen(List<Employee> employeeList) {
        for (int i = 0; i < employeeList.toArray().length; i++) {
            if (emp.getGender() === Gender.M)) {
               //----------------
            }
        }
    }

    @Override
    public void printSalariesAscending(List<Employee> employeeList) {

    }

    @Override
    public void printUniqueSalaries(List<Employee> employeeList) {

    }
}
