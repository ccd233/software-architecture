package prototypepattern;

/**
 * @Author Nie Yixin
 * @Description: Whale实体类
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
    /***
     * @Author: Nie Yixin
     * @Description: clone
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: Whale object
     * @resume:
     *
     * @Date:
     * @Modified By:
     **/
    @Override
    public Fish clone() {

        return new Whale(this);
    }
}
