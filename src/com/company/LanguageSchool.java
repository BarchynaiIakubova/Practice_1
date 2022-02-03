package com.company;

public class LanguageSchool {
    String language;
    int price;
    String teacher;
    byte frequency;
    double duration;

    void speaking() {
        System.out.println(language + " " + frequency +
                " per week and duration is " + duration + ". Teaches a " + teacher + " teacher" + ". Price for the course is " + price);
    }
    void writing() {
        System.out.println("Writing essay");
    }
    void reading() {
        System.out.println("Reading by level");
    }
    void listening() {
        System.out.println("Listening Real life conversation");
    }
}
