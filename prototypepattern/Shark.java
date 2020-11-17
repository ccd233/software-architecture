package com.java.nyx.prototypepattern;
/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 10:19 2020/11/13
 * @Modified By:
 **/
public class Shark extends Fish {
    public String color;
    public int weight;
    public String type;
    public int year;

    public Shark(){

    }

    public Shark(Shark target) {
        super(target);
        if (target != null) {
            this.color = target.color;
            this.weight = target.weight;
            this.type = target.type;
            this.year = target.year;
        }
    }

    @Override
    public Fish clone() {
        return new Shark(this);
    }

}
