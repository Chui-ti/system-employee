package org.example;

public class Developer extends Employee{

    public Developer (String name){
        super(name);
    }

    @Override
    public String getPosition(){
        return "Developer";
    }

    @Override
    public double calculateSalary(){
        return 100000;
    }

}
