package com.company;

public class Employee extends Person{
    private String position;
    private double salary;

    //Employee(){
      //  super();
    //}
    public Employee(String name, String surname, String position, double salary){
        super(name, surname,id_gen);//тут добавил id_gen потом убери
        setPosition(position);
        setSalary(salary);
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public double getPaymentAmount(){
        return getSalary();
    }

    @Override
    public String toString(){
        return "Employee:" + getId() + ". " + getName() + " " + getSurname() +  " earns " + getPaymentAmount() + " tenge";
    }


}
