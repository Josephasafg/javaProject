import java.util.Date;
import java.util.Objects;

public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String branchName;
    private String extraInfo;
    private double totalHours;
    private int empCode;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, String extraInfo, double totalHours, String branchName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.extraInfo = extraInfo;
        this.totalHours = totalHours;
        this.branchName = branchName;
        this.empCode = hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public void setEmpCode() {
        this.empCode = hashCode();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }




    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpCode() {
        return empCode;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public double getTotalHours() {
        return this.totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }
}
