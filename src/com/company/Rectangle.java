package com.company;

public class Rectangle {
    private int a;
    private int b;

    public void setA(int width) {
        this.a = width;
    }
    public int getA() {
        return a;
    }

    void perimeter() {
        int perRec = 2 * (a + b);
        System.out.println(perRec);
    }
}
