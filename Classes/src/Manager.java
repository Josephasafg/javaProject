import java.util.Date;

public class Manager extends Employee {
    private EmployeeTypes type;

    public Manager(){}
    public Manager(int id, String firstName, String lastName, String extraInfo, double totalHours,String branchName) {
        super(id, firstName, lastName, extraInfo, totalHours,branchName);
        this.type = EmployeeTypes.MANAGER;
    }

    public void addEmployeeToDB(Employee employee) {

    }
}
