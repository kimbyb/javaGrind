package org.study.java.homework1.oop;

public class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public  void printInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary );
    }
}
