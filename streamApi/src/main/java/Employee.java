import java.time.LocalDate;

public class Employee {

    private String name;
    private Integer sall;
    private Gender gender;
    private LocalDate birthdate;

    public Employee(String name, Integer salary, Gender gender, LocalDate bd) {
        this.name = name;
        this.sall = sall;
        this.gender = gender;
        this.birthdate = bd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return sall;
    }

    public void setSalary(Integer sallr) {
        this.sall = sallr;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate bd) {
        this.birthdate = bd;
    }
}
