package com.company;

public class Student extends Person {

    private double gpa;

    // Student() {
    //    super();
    //}

    Student(String name, String surname, double gpa) {
        super(name, surname,id_gen);//тут добавил id_gen потом убери
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }


    public double getPaymentAmount() {
        if(getGpa() > 2.67)
            return 36660.0;
        else return 0.0;
    }
    public void eat(){
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Student:" + getId() + ". " + getName() + " " + getSurname() +  " earns " + getPaymentAmount() + " tenge";
    }
}