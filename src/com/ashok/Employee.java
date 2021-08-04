package com.ashok;

import java.util.Date;

public class Employee {
    private int empNumber;
    private String empName;
    private Double salary;
    private Date doj;
    private int age;

    public Employee(int empNumber, String empName, Double salary, Date doj, int age) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.salary = salary;
        this.doj = doj;
        this.age = age;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", doj=" + doj +
                ", age=" + age +
                '}';
    }
}
