package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Laptop laptop = new Laptop();
    laptop.setLaptopName("HP");
    laptop.setMemory(16);
    laptop.setColor("Silver");
    laptop.setCpu("Cor i 7");
        System.out.println(laptop.getLaptopName() + " " + laptop.getColor() + " " + laptop.getCpu() + laptop.getMemory());
     laptop.shutDown();
     laptop.turnOn();

    }

}
