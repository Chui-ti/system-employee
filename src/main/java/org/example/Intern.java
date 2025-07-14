package org.example;

public class Intern extends Employee{
    public Intern(String name){
        super(name);
    }


    public String getPosition(){
        return "Intern";
    }

    public double calculateSalary(){
        return 30000;
    }
}
