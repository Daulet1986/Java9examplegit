package com.company;

public class Person implements IPayable, Comparable<Person>{
    protected static int id_gen = 1;
    protected int id;
    protected String name, surname;


    //Person(){
      //  id = id_gen++;
    //}
    public Person(String name, String surname,int id){
        //this();
        this.id = id_gen++;
        setName(name);
        setSurname(surname);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getPosition(String position){
        return position;
    }
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname() +  " earns " + getPaymentAmount() + " tenge";
    }
    @Override
    public int compareTo(Person a) {
        return (int) (this.getPaymentAmount() - a.getPaymentAmount());
    }
}
