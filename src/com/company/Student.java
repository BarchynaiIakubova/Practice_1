package com.company;

public class Student {
    private String nameStudent;
    private String surname;
    private int age;
    private String borndate;

    public void setNameStudent(String name) {
        this.nameStudent = name;
    }
    public String getNameStudent() {
        return nameStudent;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if (age > 1) {
            this.age = age;
        }
        else System.out.println("The value you entered is wrong");
    }
    public int getAge() {
        return age;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }
    public String getBorndate() {
        return borndate;
    }
}
