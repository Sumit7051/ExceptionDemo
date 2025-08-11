package org.example.entity;

public class BankAccount {

    private int id;
    private String name;
    private long custActNumber;
    private double balance;

    public BankAccount(int id, String name,long custActNumber, double bal)
    {
        this.id = id;
        this.name = name;
        this.custActNumber = custActNumber;
        this.balance=bal;
    }
    public void diplay()
    {
        System.out.println(id+ " | "+name+ " | "+balance);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getCustActNumber() {
        return custActNumber;
    }

    public void setCustActNumber(long custActNumber) {
        this.custActNumber = custActNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", custActNumber=" + custActNumber +
                ", balance=" + balance +
                '}';
    }
}
