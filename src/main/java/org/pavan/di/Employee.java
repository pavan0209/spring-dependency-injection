package org.pavan.di;

public class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}');
    }
}
