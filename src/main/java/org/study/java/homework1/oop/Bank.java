package org.study.java.homework1.oop;

public class Bank {

    private String accountNumber;
    private double balance;

    protected Bank(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected double deposit(double amount) {
        return balance += amount;
    }

    protected double withdraw(double amount) {
        if (balance >= amount) {
            return balance - +amount;
        } else {
            System.out.println("Not enough balance");
        }
        return amount;
    }

    protected double getBalance() {
        return balance;
    }
}
