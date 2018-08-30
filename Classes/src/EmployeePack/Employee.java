package EmployeePack;

import ClientPack.Client;
import Utilities.GlobalLogger;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;


public abstract class Employee {
    GlobalLogger log = new GlobalLogger("projectLog.log");
    private int id;
    private String firstName;
    private String lastName;
    private int branchNumber;
    private String extraInfo;
    private double totalHours;
    private int empCode;
    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    private EmployeeTypes type;


    public Employee() throws IOException {
        try {
            log.logger.setLevel(Level.INFO);
        }catch (Exception e) {throw new IllegalStateException();}
    }

    public void setType(EmployeeTypes type) {
        this.type = type;
    }

    public Employee(int id, String firstName, String lastName, double totalHours, int branchNumber, EmployeeTypes type, String phone) throws IOException {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalHours = totalHours;
        this.branchNumber = branchNumber;
        this.empCode = hashCode();
        this.type = type;
        this.phone = phone;
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
    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "log=" + log +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", branchNumber=" + branchNumber +
                ", extraInfo='" + extraInfo + '\'' +
                ", totalHours=" + totalHours +
                ", empCode=" + empCode +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
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

    public double getTotalHours() {
        return this.totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

}
