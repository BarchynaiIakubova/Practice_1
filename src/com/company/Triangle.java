package com.company;

public class Triangle {
    int a;
    int b;
    int c;
    void area() {
        double s = (a + b + c) / 2d;
        double area = s * (s - a) * (s - b) * (s - c);
        System.out.println(Math.sqrt(area));
    }
}
