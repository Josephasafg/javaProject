import java.util.Date;

public class Manager extends Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String title;
    private Date lastModifiedDate;
    private String extraInfo;
    private double totalHours;
    private EmployeeTypes type;

    public Manager(int id, String firstName, String lastName, String title, Date lastModifiedDate, String extraInfo, double totalHours, int id1, String firstName1, String lastName1, String title1, Date lastModifiedDate1, String extraInfo1, double totalHours1, EmployeeTypes type) {
        super(id, firstName, lastName, title, lastModifiedDate, extraInfo, totalHours);
        this.type = EmployeeTypes.MANAGER;
    }

    public void addEmployeeToDB(Employee employee) {

    }
}
