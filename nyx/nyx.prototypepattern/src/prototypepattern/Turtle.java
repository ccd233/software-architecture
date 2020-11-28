package prototypepattern;

/**
 * @Author Nie Yixin
 * @Description: Turtle实体类
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
    /***
     * @Author: Nie Yixin
     * @Description: clone
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: Turtle object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    @Override
    public Turtle clone() {
        return new Turtle(this);
    }
}
