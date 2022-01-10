package com.company.Users;

public class TeacherUser extends RealUser{
    private String fatherName;

    public TeacherUser(String firstName, String lastName, String fatherName, int age, int amountOfMoney){
        super(firstName,lastName,age, amountOfMoney);
        setFatherName(fatherName);
    }


    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        String resultString=super.toString().replace("{","").replace("}","").replace("RealUser","");
        return "TeacherUser{" +resultString+", "+
                "fatherName='" + fatherName + '\'' +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello to everyone");
    }

    @Override
    public String getFullName() {

        return getFirstName()+" "+getLastName()+" "+getFatherName() ;
    }

}
