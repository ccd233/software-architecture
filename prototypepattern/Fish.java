package com.java.nyx.prototypepattern;
/**
 * @Author Nie Yixin
 * @Description: Fish entity
 * @Date: Created in 10:02 2020/11/13
 * @Modified By:
 **/
public abstract class Fish {

    public String color;
    public int weight;
    public String type;
    public int year;

    public Fish() {

    }
    public Fish(Fish target) {
        if (target != null) {
            this.color = target.color;
            this.weight = target.weight;
            this.type = target.type;
            this.year = target.year;
        }
    }
    public abstract Fish clone();

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
