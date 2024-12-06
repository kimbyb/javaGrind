package org.study.java.homework1.oop;

public class Manager extends Employee{

    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Bonus: " + bonus );
    }
}
