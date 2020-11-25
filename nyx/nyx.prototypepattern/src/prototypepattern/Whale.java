package prototypepattern;

/**
 * @Author Nie Yixin
 * @Description: woman builder implements builder
 * @Date: Created in 10:22 2020/11/13
 * @Modified By:
 **/
public class Whale extends Fish {
    public String color;
    public int weight;
    public String type;
    public int year;

    public Whale(){

    }

    public Whale(Whale target) {
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

        return new Whale(this);
    }
}
