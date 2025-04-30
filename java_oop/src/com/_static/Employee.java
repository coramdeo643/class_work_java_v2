package com._static;

public class Employee {

    private int employeeId;
    private String name;
    private String department;

    // 생성자
    public Employee(String name) {
        this.name = name;
        // Use class variable, Company.empSerialNumber
        // can access with class name
        employeeId = Company.empSerialNumber;
        Company.empSerialNumber++;
        // employeeId = 1;
    }

    // getter = read only

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // method
    public void showInfo(){

    }


}
