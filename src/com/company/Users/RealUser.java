package com.company.Users;

import java.util.Objects;

public abstract class RealUser implements User{
    private String firstName;
    private String lastName;
    private int age;
    private int amountOfMoney;
    private static int numberOfUsers=0;

    protected RealUser(String firstName, String lastName, int age, int amountOfMoney){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setAmountOfMoney(amountOfMoney);
        numberOfUsers++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    @Override
    public String toString() {
        return "RealUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    @Override
    public void sayHello() {

    }

    @Override
    public String getFullName() {
        return this.firstName+" "+this.lastName;
    }

    @Override
    public void register() {

    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getAmountOfMoney() {
        return this.amountOfMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealUser realUser = (RealUser) o;
        return age == realUser.age && amountOfMoney == realUser.amountOfMoney && Objects.equals(firstName, realUser.firstName) && Objects.equals(lastName, realUser.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, amountOfMoney);
    }
}
