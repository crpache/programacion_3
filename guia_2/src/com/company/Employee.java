package com.company;

public class Employee {
    private int dni;
    private String name;
    private String surname;
    private double salary;

    public Employee(int dni, String name, String surname, double salary){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double annualSalary(){
        return (int)this.salary * 12;
    }

    public void increaseSalary(float percentage){
        setSalary(this.salary + this.salary * percentage/100);
    }

    public void getDescription(){
        System.out.println("Employee [DNI: " + this.dni
                             + ", Name: " + this.name
                             + ", Surname: " + this.surname
                             + ", Salary: " + this.salary + "]");
    }
}
