package prototypepattern;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 10:12 2020/11/13
 * @Modified By:
 **/
public class Turtle extends Fish{
    public String color;
    public String type;
    public int weight;
    public int year;

    public Turtle() {

    }
    public Turtle(Turtle target) {
        super(target);
        if (target!=null) {
            this.color = target.color;
            this.type = target.type;
            this.weight = target.weight;
            this.year = target.year;
        }
    }

    @Override
    public Turtle clone() {
        return new Turtle(this);
    }
}
