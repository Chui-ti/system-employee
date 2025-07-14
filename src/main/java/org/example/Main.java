package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> empl = new ArrayList<>();
        empl.add(new Developer("Оля"));
        empl.add(new Manager("Максим"));
        empl.add(new Intern("Соня"));


        for (Employee person : empl) {
            person.introduce();
            System.out.println("Моя зарплата: " + person.calculateSalary());
        }
    }
}
