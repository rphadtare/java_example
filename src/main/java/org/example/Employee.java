package org.example;

public class Employee extends Person {
    private int empId;
    private String orgName;

    public int getEmpId() {
        return empId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Employee(int empId, String orgName, String name, String address, int age) {
        super(name,address,age);
        this.empId = empId;
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", orgName='" + orgName + '\'' +
                super.toString() +
                '}';
    }

    @Override
    public void show() {
        System.out.println("EmpId : " + this.getEmpId() + " OrgName : " + this.getOrgName());
        super.show();
    }
}
