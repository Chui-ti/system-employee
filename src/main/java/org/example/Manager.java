package org.example;

public class Manager extends Employee{

    public Manager (String name){
        super(name);
    }
    public String getPosition(){
        return "Manager";
    }
    public double calculateSalary(){
        return 120000;
    }
}
