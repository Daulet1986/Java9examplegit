package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Employee employee1 = new Employee("John", "Lenon", "Guard", 27045.78 );
        persons.add(employee1);
        Employee employee2 = new Employee("George", "Harrison", "Male nurse", 50000.00);
        persons.add(employee2);
        Student student1 = new Student("Ringo", " Starr", 2.5);
        persons.add(student1);
        Student student2 = new Student("Paul", " McCartney", 3.1);
        persons.add(student2);
        Collections.sort(persons);
        printData(persons);
    }
    public static void printData( ArrayList<Person> p){
        for (Object el : p){
            System.out.println(el);
        }
    }
}