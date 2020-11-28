package prototypepattern;

/**
 * @Author Nie Yixin
 * @Description: prototypepattern.Fish entity
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
    /***
     * @Author: Nie Yixin
     * @Description: get color
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: String
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public String getColor() {
        return color;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get type
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: String
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public String getType() {
        return type;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get weight
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: int
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public int getWeight() {
        return weight;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get year
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: int
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public int getYear() {
        return year;
    }
    /***
     * @Author: Nie Yixin
     * @Description: set color
     *
     * @Param Type
     * String
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void setColor(String color) {
        this.color = color;
    }
    /***
     * @Author: Nie Yixin
     * @Description: set type
     *
     * @Param Type
     * String
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void setType(String type) {
        this.type = type;
    }
    /***
     * @Author: Nie Yixin
     * @Description: set weight
     *
     * @Param Type
     * int
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void setWeight(int weight) {
        this.weight = weight;
    }
    /***
     * @Author: Nie Yixin
     * @Description: set year
     *
     * @Param Type
     * int
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void setYear(int year) {
        this.year = year;
    }
}
