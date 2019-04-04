package com.company;

public class Main {

    public static void main(String[] args) {
        // EJERCICIO 1
        /*Rectangle myRectangle = new Rectangle(10,5);
        System.out.println("myRectangle's area: " + myRectangle.calcArea());

        myRectangle.setWidth(20);
        myRectangle.setHeight(100);

        System.out.println("myRectangle's area: " + myRectangle.calcArea());*/

        // EJERCICIO 2
        /*
        Employee cristian = new Employee(40017743, "Cristian", "Pache", 21580);
        Employee delfina = new Employee(39444099, "Delfina", "Mansilla", 24600);

        cristian.getDescription();
        delfina.getDescription();

        cristian.increaseSalary(27);
        cristian.getDescription();
        System.out.println(cristian.annualSalary());*/

        // EJERCICIO 3
        /*
        SaleItem item_1 = new SaleItem("Shoes", 7,250);
        item_1.itemDescription();*/

        // EJERCICIO 4

        BankAccount myAccount = new BankAccount("Cristian", 21580);
        myAccount.credit(7601);
        myAccount.debit(1850);
        myAccount.debit(39980);
        myAccount.info();


    }
}
