package com.company;

public class Course {
    private String nameOfCourse;
    private int number;
    private String name;
    private String startingDate;

    public void setNameOfCourse(String course) {
        this.nameOfCourse = course;
    }
    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setStartingDate(String date) {
        this.startingDate = date;
    }
    public String getStartingDate() {
        return startingDate;
    }

}
