package com.company;

public class Laptop {
    private String laptopName;
    private int memory;
    private String color;
    private String cpu;

    public void setLaptopName(String name) {
        this.laptopName = name;
    }
    public String getLaptopName() {
        return laptopName;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getMemory() {
        return memory;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setCpu(String cpuName) {
        this.cpu = cpuName;
    }
    public String getCpu() {
        return cpu;
    }

    public void turnOn
            () {
        System.out.println("The laptop is on");
    }
    public void shutDown() {
        System.out.println("The laptop is off");
    }
}
