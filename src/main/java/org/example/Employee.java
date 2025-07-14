package org.example;

public abstract class Employee {
    protected String name;

    Employee(String name)
    {
        this.name = name;
    }

    public abstract String getPosition();
    public abstract double calculateSalary();

    public void introduce()
    {
        System.out.println("Привет, я " + name + ", моя должность - " + getPosition());
    }

}
