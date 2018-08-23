package EmployeePack;

import java.util.Objects;


public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int branchNumber;
    private String extraInfo;
    private double totalHours;
    private int empCode;
    private EmployeeTypes type;


    public Employee() {}

    public Employee(int id, String firstName, String lastName, String extraInfo, double totalHours, int branchNumber, EmployeeTypes type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.extraInfo = extraInfo;
        this.totalHours = totalHours;
        this.branchNumber = branchNumber;
        this.empCode = hashCode();
        this.type = type;
    }

    public EmployeeTypes getType() {
        return type;
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

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
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
