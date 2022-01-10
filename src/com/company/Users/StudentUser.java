package com.company.Users;

public class StudentUser extends RealUser{

    public StudentUser(String firstName, String lastName, int age, int amountOfMoney){
        super(firstName,lastName,age, amountOfMoney);
    }


    @Override
    public String toString() {
        return super.toString().replace("Real","Student");
    }

    @Override
    public void sayHello() {
        System.out.println("Salam brodyagam");
    }

}
