package org.example.lesson3.task4;

public class Computer {
    private String name;
    private double coast;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", coast=" + coast +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public Computer(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }
}
